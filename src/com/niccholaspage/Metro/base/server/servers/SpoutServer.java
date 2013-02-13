package com.niccholaspage.Metro.base.server.servers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.spout.api.Engine;
import org.spout.api.Server;
import org.spout.api.plugin.CommonPlugin;
import org.spout.api.plugin.Plugin;

import com.niccholaspage.Metro.base.MetroPlugin;
import com.niccholaspage.Metro.base.PluginResources;
import com.niccholaspage.Metro.base.config.configs.SpoutConfig;
import com.niccholaspage.Metro.base.player.OfflinePlayer;
import com.niccholaspage.Metro.base.player.Player;
import com.niccholaspage.Metro.base.player.players.SpoutPlayer;
import com.niccholaspage.Metro.base.resources.SpoutPluginResources;
import com.niccholaspage.Metro.base.scheduler.Scheduler;
import com.niccholaspage.Metro.base.scheduler.schedulers.SpoutScheduler;
import com.niccholaspage.Metro.base.server.ServerType;


public class SpoutServer implements com.niccholaspage.Metro.base.server.Server {
	private final Server server;
	
	private final Scheduler scheduler;
	
	public SpoutServer(Engine engine){
		this.server = (Server) engine;
		
		scheduler = new SpoutScheduler(server);
	}
	
	public ServerType getType(){
		return ServerType.SPOUT;
	}
	
	public String getVersion(){
		return server.getVersion();
	}
	
	public void broadcastMessage(String message){
		server.broadcastMessage(message);
	}
	
	public Player getOnlinePlayer(String name, boolean exact){
		org.spout.api.entity.Player player = null;
		
		player = server.getPlayer(name, exact);
		
		if (player == null){
			return null;
		}
		
		return new SpoutPlayer(player);
	}
	
	public List<Player> getOnlinePlayers(){
		List<Player> players = new ArrayList<Player>();
		
		for (org.spout.api.entity.Player player : server.getOnlinePlayers()){
			players.add(new SpoutPlayer(player));
		}
		
		return players;
	}
	
	public OfflinePlayer getOfflinePlayer(String name){
		String[] files = new File(server.getDataFolder(), "players").list();
		
		
		OfflinePlayer offlinePlayer = null;
		
		for (String file : files){
			if (file.replace(".dat", "").equalsIgnoreCase(name)){
				offlinePlayer = new OfflinePlayer(name);
			}
		}
		
		return offlinePlayer;
	}

	public List<OfflinePlayer> getOfflinePlayers(){
		List<OfflinePlayer> offlinePlayers = new ArrayList<OfflinePlayer>();
		
		String[] files = new File(server.getDataFolder(), "players").list();
		
		for (String file : files){
			offlinePlayers.add(new OfflinePlayer(file.replace(".dat", "")));
		}
		
		return offlinePlayers;
	}
	
	public MetroPlugin getPlugin(String name){
		Plugin plugin = server.getPluginManager().getPlugin(name);
		
		if (plugin == null){
			return null;
		}
		
		MetroPlugin metroPlugin = new MetroPlugin();
		
		PluginResources resources = new SpoutPluginResources((CommonPlugin) plugin, plugin.getDescription().getName(), plugin.getDescription().getVersion());
		
		metroPlugin.intialize(resources, new SpoutServer(plugin.getEngine()), plugin.getLogger(), new SpoutConfig(new File(plugin.getDataFolder(), "config.yml")), plugin.getDataFolder());
		
		return metroPlugin;
	}
	
	public void disablePlugin(MetroPlugin plugin){
		Plugin spoutPlugin = server.getPluginManager().getPlugin(plugin.getResources().getName());
		
		server.getPluginManager().disablePlugin(spoutPlugin);
	}

	public Scheduler getScheduler(){
		return scheduler;
	}
}

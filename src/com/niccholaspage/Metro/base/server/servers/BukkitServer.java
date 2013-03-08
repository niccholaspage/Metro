package com.niccholaspage.Metro.base.server.servers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Server;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.niccholaspage.Metro.base.MetroPlugin;
import com.niccholaspage.Metro.base.PluginResources;
import com.niccholaspage.Metro.base.config.configs.BukkitConfig;
import com.niccholaspage.Metro.base.player.Player;
import com.niccholaspage.Metro.base.player.OfflinePlayer;
import com.niccholaspage.Metro.base.player.players.BukkitPlayer;
import com.niccholaspage.Metro.base.resources.BukkitPluginResources;
import com.niccholaspage.Metro.base.scheduler.Scheduler;
import com.niccholaspage.Metro.base.scheduler.schedulers.BukkitScheduler;
import com.niccholaspage.Metro.base.server.ServerType;
import com.niccholaspage.Metro.world.World;
import com.niccholaspage.Metro.world.worlds.BukkitWorld;


public class BukkitServer implements com.niccholaspage.Metro.base.server.Server {
	private final Server server;
	
	private final Scheduler scheduler;
	
	public BukkitServer(Server server){
		this.server = server;
		
		scheduler = new BukkitScheduler(server);
	}
	
	public ServerType getType(){
		return ServerType.BUKKIT;
	}
	
	public String getVersion(){
		return server.getBukkitVersion();
	}
	
	public void broadcastMessage(String message){
		server.broadcastMessage(message);
	}
	
	public Player getOnlinePlayer(String name, boolean exact){
		org.bukkit.entity.Player player = null;
		
		if (exact){
			player = server.getPlayerExact(name);
		}else {
			player = server.getPlayer(name);
		}
		
		if (player == null){
			return null;
		}
		
		return new BukkitPlayer(player);
	}
	
	public List<Player> getOnlinePlayers(){
		List<Player> players = new ArrayList<Player>();
		
		for (org.bukkit.entity.Player player : server.getOnlinePlayers()){
			players.add(new BukkitPlayer(player));
		}
		
		return players;
	}
	
	public OfflinePlayer getOfflinePlayer(String name){
		org.bukkit.OfflinePlayer offlinePlayer = server.getOfflinePlayer(name);
		
		if (offlinePlayer  == null){
			return null;
		}
		
		return new OfflinePlayer(offlinePlayer.getName());
	}
	
	public List<OfflinePlayer> getOfflinePlayers(){
		List<OfflinePlayer> offlinePlayers = new ArrayList<OfflinePlayer>();
		
		for (org.bukkit.OfflinePlayer offlinePlayer : server.getOfflinePlayers()){
			offlinePlayers.add(new OfflinePlayer(offlinePlayer.getName()));
		}
		
		return offlinePlayers;
	}
	
	public World getWorld(String name){
		return new BukkitWorld(server.getWorld(name));
	}
	
	public List<World> getWorlds(){
		List<World> worlds = new ArrayList<World>();
		
		for (org.bukkit.World world : server.getWorlds()){
			worlds.add(new BukkitWorld(world));
		}
		
		return worlds;
	}
	
	public MetroPlugin getPlugin(String name){
		Plugin plugin = server.getPluginManager().getPlugin(name);
		
		if (plugin == null){
			return null;
		}
		
		MetroPlugin metroPlugin = new MetroPlugin();

		PluginResources resources = new BukkitPluginResources((JavaPlugin) plugin, plugin.getDescription().getName(), plugin.getDescription().getVersion());
		
		metroPlugin.intialize(resources, new BukkitServer(plugin.getServer()), plugin.getServer().getLogger(), new BukkitConfig(new File(plugin.getDataFolder(), "config.yml")), plugin.getDataFolder());
		
		return metroPlugin;
	}
	
	public void disablePlugin(MetroPlugin plugin){
		Plugin bukkitPlugin = server.getPluginManager().getPlugin(plugin.getResources().getName());
		
		server.getPluginManager().disablePlugin(bukkitPlugin);
	}
	
	public Scheduler getScheduler(){
		return scheduler;
	}
}

package com.niccholaspage.Metro.base.server.servers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.spout.api.Engine;
import org.spout.api.Server;

import com.niccholaspage.Metro.base.player.OfflinePlayer;
import com.niccholaspage.Metro.base.player.Player;
import com.niccholaspage.Metro.base.player.players.SpoutPlayer;


public class SpoutServer implements com.niccholaspage.Metro.base.server.Server {
	private final Server server;
	
	public SpoutServer(Engine engine){
		this.server = (Server) engine;
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
}

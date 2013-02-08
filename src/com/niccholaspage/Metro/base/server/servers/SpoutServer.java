package com.niccholaspage.Metro.base.server.servers;

import java.util.ArrayList;
import java.util.List;

import org.spout.api.Engine;
import org.spout.api.Server;
import org.spout.api.entity.Player;

import com.niccholaspage.Metro.base.player.MetroOfflinePlayer;
import com.niccholaspage.Metro.base.player.MetroPlayer;
import com.niccholaspage.Metro.base.server.MetroServer;


public class SpoutServer implements MetroServer {
	private final Server server;
	
	public SpoutServer(Engine engine){
		this.server = (Server) engine;
	}
	
	public void broadcastMessage(String message){
		server.broadcastMessage(message);
	}
	
	public List<MetroPlayer> getOnlinePlayers(){
		List<MetroPlayer> players = new ArrayList<MetroPlayer>();
		
		for (Player player : server.getOnlinePlayers()){
			players.add(new MetroPlayer(player));
		}
		
		return players;
	}
	
	public MetroOfflinePlayer getOfflinePlayer(String name){
		String[] files = server.getDataFolder().list();
		
		MetroOfflinePlayer offlinePlayer = null;
		
		for (String file : files){
			if (file.replace(".dat", "").equalsIgnoreCase(name)){
				offlinePlayer = new MetroOfflinePlayer(name);
			}
		}
		
		return offlinePlayer;
	}

	public List<MetroOfflinePlayer> getOfflinePlayers(){
		List<MetroOfflinePlayer> offlinePlayers = new ArrayList<MetroOfflinePlayer>();
		
		String[] files = server.getDataFolder().list();
		
		for (String file : files){
			offlinePlayers.add(new MetroOfflinePlayer(file.replace(".dat", "")));
		}
		
		return offlinePlayers;
	}
}

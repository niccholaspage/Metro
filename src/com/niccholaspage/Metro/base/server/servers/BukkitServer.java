package com.niccholaspage.Metro.base.server.servers;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.OfflinePlayer;
import org.bukkit.Server;
import org.bukkit.entity.Player;

import com.niccholaspage.Metro.base.player.MetroOfflinePlayer;
import com.niccholaspage.Metro.base.player.MetroPlayer;
import com.niccholaspage.Metro.base.server.MetroServer;


public class BukkitServer implements MetroServer {
	private final Server server;
	
	public BukkitServer(Server server){
		this.server = server;
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
		OfflinePlayer offlinePlayer = server.getOfflinePlayer(name);
		
		if (offlinePlayer  == null){
			return null;
		}
		
		return new MetroOfflinePlayer(offlinePlayer);
	}
}

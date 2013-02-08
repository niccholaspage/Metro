package com.niccholaspage.Metro.base.server.servers;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Server;

import com.niccholaspage.Metro.base.player.Player;
import com.niccholaspage.Metro.base.player.OfflinePlayer;
import com.niccholaspage.Metro.base.player.players.BukkitPlayer;


public class BukkitServer implements com.niccholaspage.Metro.base.server.Server {
	private final Server server;
	
	public BukkitServer(Server server){
		this.server = server;
	}
	
	public void broadcastMessage(String message){
		server.broadcastMessage(message);
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
		
		return new OfflinePlayer(offlinePlayer);
	}
	
	public List<OfflinePlayer> getOfflinePlayers(){
		List<OfflinePlayer> offlinePlayers = new ArrayList<OfflinePlayer>();
		
		for (org.bukkit.OfflinePlayer offlinePlayer : server.getOfflinePlayers()){
			offlinePlayers.add(new OfflinePlayer(offlinePlayer));
		}
		
		return offlinePlayers;
	}
}

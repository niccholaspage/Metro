package com.niccholaspage.Metro.base.server.servers;

import org.bukkit.Server;

import com.niccholaspage.Metro.base.server.MetroServer;


public class BukkitServer implements MetroServer {
	private final Server server;
	
	public BukkitServer(Server server){
		this.server = server;
	}
	
	public void broadcastMessage(String message){
		server.broadcastMessage(message);
	}
}

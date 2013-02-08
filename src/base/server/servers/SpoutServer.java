package base.server.servers;

import org.spout.api.Engine;
import org.spout.api.Server;

import base.server.MetroServer;

public class SpoutServer implements MetroServer {
	private final Server server;
	
	public SpoutServer(Engine engine){
		this.server = (Server) engine;
	}
	
	public void broadcastMessage(String message){
		server.broadcastMessage(message);
	}
}

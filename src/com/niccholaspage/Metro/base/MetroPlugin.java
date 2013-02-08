package com.niccholaspage.Metro.base;

import java.util.logging.Logger;

import com.niccholaspage.Metro.base.server.Server;


public class MetroPlugin {
	private Server server;
	
	private Logger logger;
	
	public void onEnable(){
		
	}
	
	public void onDisable(){
		
	}
	
	public void intialize(Server server, Logger logger){
		this.server = server;
		
		this.logger = logger;
	}
	
	public Server getServer(){
		return server;
	}
	
	public Logger getLogger(){
		return logger;
	}
}

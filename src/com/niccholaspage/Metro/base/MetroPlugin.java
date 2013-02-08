package com.niccholaspage.Metro.base;

import java.util.logging.Logger;

import com.niccholaspage.Metro.base.server.MetroServer;


public class MetroPlugin {
	private MetroServer server;
	
	private Logger logger;
	
	public void onEnable(){
		
	}
	
	public void onDisable(){
		
	}
	
	public void intialize(MetroServer server, Logger logger){
		this.server = server;
		
		this.logger = logger;
	}
	
	public MetroServer getServer(){
		return server;
	}
	
	public Logger getLogger(){
		return logger;
	}
}

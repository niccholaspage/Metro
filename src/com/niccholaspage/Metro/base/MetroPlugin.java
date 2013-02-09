package com.niccholaspage.Metro.base;

import java.util.logging.Logger;

import com.niccholaspage.Metro.base.config.Config;
import com.niccholaspage.Metro.base.server.Server;


public class MetroPlugin {
	private Server server;
	
	private Logger logger;
	
	private Config config;
	
	public void onEnable(){
		
	}
	
	public void onDisable(){
		
	}
	
	public void intialize(Server server, Logger logger, Config config){
		this.server = server;
		
		this.logger = logger;
		
		this.config = config;
	}
	
	public Server getServer(){
		return server;
	}
	
	public Logger getLogger(){
		return logger;
	}
	
	public Config getConfig(){
		return config;
	}
}

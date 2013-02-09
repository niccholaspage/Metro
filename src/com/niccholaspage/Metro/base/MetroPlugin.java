package com.niccholaspage.Metro.base;

import java.io.File;
import java.util.logging.Logger;

import com.niccholaspage.Metro.base.config.Config;
import com.niccholaspage.Metro.base.server.Server;


public class MetroPlugin {
	private Server server;
	
	private Logger logger;
	
	private Config config;
	
	private File dataFolder;
	
	public void onEnable(){
		
	}
	
	public void onDisable(){
		
	}
	
	public void intialize(Server server, Logger logger, Config config, File dataFolder){
		this.server = server;
		
		this.logger = logger;
		
		this.config = config;
		
		this.dataFolder = dataFolder;
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
	
	public File getDataFolder(){
		return dataFolder;
	}
}

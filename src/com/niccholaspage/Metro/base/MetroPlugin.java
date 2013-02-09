package com.niccholaspage.Metro.base;

import java.io.File;
import java.util.logging.Logger;

import com.niccholaspage.Metro.base.config.Config;
import com.niccholaspage.Metro.base.server.Server;
import com.niccholaspage.Metro.base.server.ServerType;


public class MetroPlugin {
	private PluginDescription description;
	
	private Server server;
	
	private Logger logger;
	
	private Config config;
	
	private File dataFolder;
	
	public void onEnable(){
		
	}
	
	public void onDisable(){
		
	}
	
	public void log(String message){
		if (getServer().getType() == ServerType.BUKKIT){
			message = "[" + getDescription().getName() + "] " + message;
		}
		
		logger.info(message);
	}
	
	public void intialize(PluginDescription description, Server server, Logger logger, Config config, File dataFolder){
		this.description = description;
		
		this.server = server;
		
		this.logger = logger;
		
		this.config = config;
		
		this.dataFolder = dataFolder;
	}
	
	public PluginDescription getDescription(){
		return description;
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

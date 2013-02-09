package com.niccholaspage.Metro.base;

import java.io.File;
import java.util.logging.Logger;

import com.niccholaspage.Metro.base.config.Config;
import com.niccholaspage.Metro.base.loader.Loader;
import com.niccholaspage.Metro.base.server.Server;
import com.niccholaspage.Metro.base.server.ServerType;

public class MetroPlugin {
	private Loader loader;
	
	private PluginResources resources;
	
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
			message = "[" + getResources().getName() + "] " + message;
		}
		
		logger.info(message);
	}
	
	public void intialize(Loader loader, PluginResources resources, Server server, Logger logger, Config config, File dataFolder){
		this.loader = loader;
		
		this.resources = resources;
		
		this.server = server;
		
		this.logger = logger;
		
		this.config = config;
		
		this.dataFolder = dataFolder;
	}
	
	public Loader getLoader(){
		return loader;
	}
	
	public PluginResources getResources(){
		return resources;
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

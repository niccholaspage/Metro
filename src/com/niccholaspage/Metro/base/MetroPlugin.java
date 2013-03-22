package com.niccholaspage.Metro.base;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.spout.api.Spout;
import org.spout.api.chat.FormattedLogRecord;

import com.niccholaspage.Metro.base.config.Config;
import com.niccholaspage.Metro.base.server.Server;
import com.niccholaspage.Metro.base.server.ServerType;

public class MetroPlugin {
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
			getLogger().info(message);
		}else if (getServer().getType() == ServerType.SPOUT){
			Spout.getLogger().log(new FormattedLogRecord(Level.INFO, message));
		}
	}
	
	public void intialize(PluginResources resources, Server server, Logger logger, Config config, File dataFolder){
		this.resources = resources;
		
		this.server = server;
		
		this.logger = logger;
		
		this.config = config;
		
		this.dataFolder = dataFolder;
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

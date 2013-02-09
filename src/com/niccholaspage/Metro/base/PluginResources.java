package com.niccholaspage.Metro.base;

import java.io.File;
import java.io.InputStream;

import com.niccholaspage.Metro.base.command.CommandExecutor;
import com.niccholaspage.Metro.base.config.Config;

public abstract class PluginResources {
	private final String name;
	
	private final String version;
	
	public PluginResources(String name, String version){
		this.name = name;
		
		this.version = version;
	}
	
	public String getName(){
		return name;
	}
	
	public String getVersion(){
		return version;
	}
	
	public abstract InputStream getFileResource(String resource);
	
	public abstract Config newConfig(File file);
	
	public abstract void registerCommand(String name, CommandExecutor executor);
}

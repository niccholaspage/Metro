package com.niccholaspage.Metro.base.resources;

import java.io.File;
import java.io.InputStream;

import org.bukkit.plugin.java.JavaPlugin;

import com.niccholaspage.Metro.base.PluginResources;
import com.niccholaspage.Metro.base.command.BukkitCommandExecutor;
import com.niccholaspage.Metro.base.command.CommandExecutor;
import com.niccholaspage.Metro.base.config.Config;
import com.niccholaspage.Metro.base.config.configs.BukkitConfig;

public class BukkitPluginResources extends PluginResources {
	private final JavaPlugin plugin;
	
	public BukkitPluginResources(JavaPlugin plugin, String name, String version){
		super(name, version);
		
		this.plugin = plugin;
	}

	public InputStream getFileResource(String filename){
		return plugin.getResource(filename);
	}
	
	public Config newConfig(File file){
		return new BukkitConfig(file);
	}
	
	public void registerCommand(String name, CommandExecutor executor){
		plugin.getCommand(name).setExecutor(new BukkitCommandExecutor(executor));
	}
}

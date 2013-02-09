package com.niccholaspage.Metro.base.resources;

import java.io.InputStream;

import org.bukkit.plugin.java.JavaPlugin;

import com.niccholaspage.Metro.base.PluginResources;

public class BukkitPluginResources extends PluginResources {
	private final JavaPlugin plugin;
	
	public BukkitPluginResources(JavaPlugin plugin, String name, String version){
		super(name, version);
		
		this.plugin = plugin;
	}

	public InputStream getFileResource(String filename){
		return plugin.getResource(filename);
	}
}

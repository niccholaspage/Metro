package com.niccholaspage.Metro.base.resources;

import java.io.InputStream;

import org.spout.api.plugin.CommonPlugin;

import com.niccholaspage.Metro.base.PluginResources;

public class SpoutPluginResources extends PluginResources {
	private final CommonPlugin plugin;
	
	public SpoutPluginResources(CommonPlugin plugin, String name, String version){
		super(name, version);
		
		this.plugin = plugin;
	}

	public InputStream getFileResource(String filename){
		return plugin.getResource(filename);
	}
}

package com.niccholaspage.Metro.base.resources;

import java.io.File;
import java.io.InputStream;

import org.spout.api.plugin.CommonPlugin;

import com.niccholaspage.Metro.base.PluginResources;
import com.niccholaspage.Metro.base.command.CommandExecutor;
import com.niccholaspage.Metro.base.command.SpoutCommandExecutor;
import com.niccholaspage.Metro.base.config.Config;
import com.niccholaspage.Metro.base.config.configs.SpoutConfig;

public class SpoutPluginResources extends PluginResources {
	private final CommonPlugin plugin;
	
	public SpoutPluginResources(CommonPlugin plugin, String name, String version){
		super(name, version);
		
		this.plugin = plugin;
	}

	public InputStream getFileResource(String filename){
		return plugin.getResource(filename);
	}
	
	public Config newConfig(File file){
		return new SpoutConfig(file);
	}
	
	public void registerCommand(String name, CommandExecutor executor){
		plugin.getEngine().getRootCommand().addSubCommand(plugin, name).setExecutor(new SpoutCommandExecutor(executor));
	}
}

package com.niccholaspage.Metro.base.config.configs;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.niccholaspage.Metro.base.config.Config;

public class BukkitConfig extends BukkitConfigSection implements Config {
	private final JavaPlugin plugin;
	
	private final File file;
	
	private final String resource;
	
	protected YamlConfiguration config;
	
	public BukkitConfig(File file){
		this(null, file, null);
	}
	
	public BukkitConfig(JavaPlugin plugin, File file, String resource){
		this.plugin = plugin;
		
		this.file = file;
		
		this.resource = resource;
		
		reload();
	}
	
	public void setHeader(String header){
		config.options().header(header);
	}
	
	public String getHeader(){
		return config.options().header();
	}
	
	public void reload(){
		config = YamlConfiguration.loadConfiguration(file);

		setConfigurationSection(config);
		
		config.options().copyDefaults(true);
		
		if (plugin != null){
			InputStream defaultConfigStream = plugin.getResource(resource);
			
			if (defaultConfigStream != null){
				YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defaultConfigStream);

				config.setDefaults(defConfig);
			}
		}
	}
	
	public void save(){
		try {
			config.save(file);
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}

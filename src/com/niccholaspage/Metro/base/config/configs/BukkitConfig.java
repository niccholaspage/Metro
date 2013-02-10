package com.niccholaspage.Metro.base.config.configs;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

import com.niccholaspage.Metro.base.config.Config;

public class BukkitConfig extends BukkitConfigSection implements Config {
	private final File file;
	
	protected YamlConfiguration config;
	
	public BukkitConfig(File file){
		this.file = file;
		
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
		
		config.options().copyDefaults(true);
		
		setConfigurationSection(config);
	}
	
	public void save(){
		try {
			config.save(file);
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}

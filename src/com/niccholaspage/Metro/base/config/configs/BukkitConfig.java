package com.niccholaspage.Metro.base.config.configs;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.bukkit.configuration.file.YamlConfiguration;

import com.niccholaspage.Metro.base.config.Config;

public class BukkitConfig extends BukkitConfigSection implements Config {
	private final File file;
	
	private final InputStream defaultConfigStream;
	
	protected YamlConfiguration config;
	
	public BukkitConfig(File file){
		this(file, null);
	}
	
	public BukkitConfig(File file, InputStream defaultConfigStream){
		this.file = file;
		
		this.defaultConfigStream = defaultConfigStream;
		
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
		
		if (defaultConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defaultConfigStream);

			config.setDefaults(defConfig);
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

package com.niccholaspage.Metro.base.config.configs;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

import com.niccholaspage.Metro.base.config.Config;

public class BukkitConfig extends BukkitConfigSection implements Config {
	private final File file;
	
	private final YamlConfiguration config;
	
	public BukkitConfig(File file){
		this.file = file;
		
		config = YamlConfiguration.loadConfiguration(file);
		
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

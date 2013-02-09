package com.niccholaspage.Metro.base.config.configs;

import java.io.File;

import org.spout.api.exception.ConfigurationException;
import org.spout.api.util.config.yaml.YamlConfiguration;

import com.niccholaspage.Metro.base.config.Config;

public class SpoutConfig extends SpoutConfigSection implements Config {
	private final File file;
	
	private YamlConfiguration config;
	
	public SpoutConfig(File file){
		this.file = file;
		
		reload();
	}
	
	public void reload(){
		config = new YamlConfiguration(file);
		
		try {
			config.load();
		} catch (ConfigurationException e){
			e.printStackTrace();
		}
		
		setConfigurationNode(config);
	}
	
	public void save(){
		try {
			config.save();
		} catch (ConfigurationException e){
			e.printStackTrace();
		}
	}
}

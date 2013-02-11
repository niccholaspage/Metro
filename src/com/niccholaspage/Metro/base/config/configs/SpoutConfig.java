package com.niccholaspage.Metro.base.config.configs;

import java.io.File;
import java.io.InputStream;
import java.util.Map;

import org.spout.api.exception.ConfigurationException;
import org.spout.api.plugin.CommonPlugin;
import org.spout.api.util.config.Configuration;
import org.spout.api.util.config.yaml.YamlConfiguration;

import com.niccholaspage.Metro.base.config.Config;

public class SpoutConfig extends SpoutConfigSection implements Config {
	private final CommonPlugin plugin;
	
	private final File file;
	
	private final String resource;
	
	protected YamlConfiguration config;
	
	public SpoutConfig(File file){
		this(null, file, null);
	}
	
	public SpoutConfig(CommonPlugin plugin, File file, String resource){
		this.plugin = plugin;
		
		this.file = file;
		
		this.resource = resource;
		
		reload();
	}
	
	public void setHeader(String header){
		config.setHeader(header.split("\n"));
	}
	
	public String getHeader(){
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < config.getHeader().length; i++){
			builder.append(config.getHeader()[i] + "\n");
		}
		
		return builder.delete(builder.length() - 3, builder.length() - 1).toString();
	}
	
	public void reload(){
		config = new YamlConfiguration(file);
		
		try {
			config.load();
		} catch (ConfigurationException e){
			e.printStackTrace();
		}
		
		setConfigurationNode(config);
		
		if (plugin != null){
			InputStream defaultConfigStream = plugin.getResource(resource);

			if (defaultConfigStream != null){
				YamlConfiguration defConfig = new YamlConfiguration(defaultConfigStream);
				
				try {
					defConfig.load();
				} catch (ConfigurationException e){
					e.printStackTrace();
				}
				
				config.setHeader(defConfig.getHeader());
				
				Map<String, Object> values = defConfig.getValues();
				
				for (String key : values.keySet()){
					addDefault(key, values.get(key));
				}
			}
		}
	}
	
	public void save(){
		try {
			config.save();
		} catch (ConfigurationException e){
			e.printStackTrace();
		}
	}
}

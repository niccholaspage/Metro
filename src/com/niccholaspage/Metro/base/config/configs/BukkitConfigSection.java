package com.niccholaspage.Metro.base.config.configs;

import java.util.Set;

import org.bukkit.configuration.ConfigurationSection;

import com.niccholaspage.Metro.base.config.ConfigSection;

public class BukkitConfigSection implements ConfigSection {
	private ConfigurationSection section;
	
	public BukkitConfigSection(){
		this(null);
	}
	
	public BukkitConfigSection(ConfigurationSection section){
		this.section = section;
	}
	
	protected void setConfigurationSection(ConfigurationSection section){
		this.section = section;
	}
	
	public ConfigSection createConfigSection(String key){
		return new BukkitConfigSection(section.createSection(key));
	}
	
	public ConfigSection getConfigSection(String key){
		return new BukkitConfigSection(section.getConfigurationSection(key));
	}
	
	public void addDefault(String key, Object value){
		System.out.println(section);
		
		section.addDefault(key, value);
	}
	
	public void addDefaults(ConfigSection section){
		Set<String> keys = section.getKeys(true);
		
		for (String key : keys){
			this.section.addDefault(key, section.getValue(key));
		}
	}
	
	public void setValue(String key, Object value){
		section.set(key, value);
	}
	
	public Object getValue(String key){
		return section.get(key);
	}
	
	public String getString(String key){
		return section.getString(key);
	}
	
	public boolean getBoolean(String key){
		return section.getBoolean(key);
	}
	
	public int getInt(String key){
		return section.getInt(key);
	}
	
	public double getDouble(String key){
		return section.getDouble(key);
	}
	
	public long getLong(String key){
		return section.getLong(key);
	}
	
	public Set<String> getKeys(boolean deep){
		return section.getKeys(deep);
	}
}

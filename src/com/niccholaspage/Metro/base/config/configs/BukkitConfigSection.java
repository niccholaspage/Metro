package com.niccholaspage.Metro.base.config.configs;

import org.bukkit.configuration.ConfigurationSection;

import com.niccholaspage.Metro.base.config.ConfigSection;
import com.niccholaspage.Metro.base.config.ValueConfigSection;

public class BukkitConfigSection extends ValueConfigSection {
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
	
	public void createConfigSection(String key){
		section.createSection(key);
	}
	
	public ConfigSection getConfigSection(String key){
		return new BukkitConfigSection(section.getConfigurationSection(key));
	}
	
	public void setValue(String key, Object value){
		section.set(key, value);
	}
	
	public Object getValue(String key){
		return section.get(key);
	}
}

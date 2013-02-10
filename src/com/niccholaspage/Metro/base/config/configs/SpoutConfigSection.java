package com.niccholaspage.Metro.base.config.configs;

import java.util.Set;

import org.spout.api.util.config.ConfigurationNode;
import org.spout.api.util.config.ConfigurationNodeSource;

import com.niccholaspage.Metro.base.config.ConfigSection;

public class SpoutConfigSection implements ConfigSection {
	private ConfigurationNodeSource node;
	
	public SpoutConfigSection(){
		this(null);
	}
	
	public SpoutConfigSection(ConfigurationNodeSource node){
		this.node = node;
	}
	
	public ConfigSection createConfigSection(String key){
		return new SpoutConfigSection(node.addNode(key));
	}
	
	protected void setConfigurationNode(ConfigurationNodeSource node){
		this.node = node;
	}
	
	public ConfigSection getConfigSection(String key){
		return new SpoutConfigSection(node.getNode(key));
	}
	
	public void addDefault(String key, Object value){
		if (!node.hasNode(key)){
			node.addNode(key).setValue(value);
		}
	}
	
	public void setValue(String key, Object value){
		ConfigurationNode node = this.node.getNode(key);
		
		if (node == null){
			node = this.node.addNode(key);
		}
		
		node.setValue(value);
	}
	
	public Object getValue(String key){
		return node.getNode(key).getValue();
	}
	
	public String getString(String key){
		return node.getNode(key).getString();
	}
	
	public boolean getBoolean(String key){
		return node.getNode(key).getBoolean();
	}
	
	public int getInt(String key){
		return node.getNode(key).getInt();
	}
	
	public double getDouble(String key){
		return node.getNode(key).getDouble();
	}
	
	public long getLong(String key){
		return node.getNode(key).getLong();
	}
	
	public Set<String> getKeys(boolean deep){
		return node.getKeys(deep);
	}
}

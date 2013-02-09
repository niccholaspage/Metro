package com.niccholaspage.Metro.base.config.configs;

import org.spout.api.util.config.ConfigurationNode;

import com.niccholaspage.Metro.base.config.ConfigSection;

public class SpoutConfigSection implements ConfigSection {
	private ConfigurationNode node;
	
	public SpoutConfigSection(){
		this(null);
	}
	
	public SpoutConfigSection(ConfigurationNode node){
		this.node = node;
	}
	
	public ConfigSection getConfigSection(String key){
		return new SpoutConfigSection(node.getNode(key));
	}
	
	public void setValue(String key, Object value){
		node.getNode(key).setValue(value);
	}
	
	public Object getValue(String key){
		return node.getNode(key).getValue();
	}
}

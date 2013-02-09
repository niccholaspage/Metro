package com.niccholaspage.Metro.base.config.configs;

import org.spout.api.util.config.ConfigurationNode;
import org.spout.api.util.config.ConfigurationNodeSource;

import com.niccholaspage.Metro.base.config.ConfigSection;
import com.niccholaspage.Metro.base.config.ValueConfigSection;

public class SpoutConfigSection extends ValueConfigSection {
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
}

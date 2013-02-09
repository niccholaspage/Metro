package com.niccholaspage.Metro.base.config;

public interface ConfigSection {
	public void createConfigSection(String key);
	
	public ConfigSection getConfigSection(String key);
	
	public void setValue(String key, Object value);
	
	public Object getValue(String key);
}

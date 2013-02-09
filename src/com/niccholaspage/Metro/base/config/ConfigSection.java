package com.niccholaspage.Metro.base.config;

public interface ConfigSection {
	public ConfigSection createConfigSection(String key);
	
	public ConfigSection getConfigSection(String key);
	
	public void setValue(String key, Object value);
	
	public Object getValue(String key);
	
	public String getString(String key);
	
	public boolean getBoolean(String key);
	
	public int getInt(String key);
	
	public double getDouble(String key);
	
	public long getLong(String key);
}

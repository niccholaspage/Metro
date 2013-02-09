package com.niccholaspage.Metro.base.config;

public abstract class ValueConfigSection implements ConfigSection {
	public String getString(String key){
		return getValue(key).toString();
	}
	
	public boolean getBoolean(String key){
		return (Boolean) getValue(key);
	}
	
	public int getInt(String key){
		return (Integer) getValue(key);
	}
	
	public double getDouble(String key){
		return (Double) getValue(key);
	}
	
	public long getLong(String key){
		return (Long) getValue(key);
	}
}

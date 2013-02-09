package com.niccholaspage.Metro.base.config;

public abstract class ValueConfigSection implements ConfigSection {
	public String getString(String key){
		return getValue(key).toString();
	}
	
	public int getInt(String key){
		return (int) getValue(key);
	}
	
	public double getDouble(String key){
		return (double) getValue(key);
	}
	
	public long getLong(String key){
		return (long) getValue(key);
	}
}

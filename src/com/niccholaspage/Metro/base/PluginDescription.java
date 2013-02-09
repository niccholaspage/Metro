package com.niccholaspage.Metro.base;

public class PluginDescription {
	private final String name;
	
	private final String version;
	
	public PluginDescription(String name, String version){
		this.name = name;
		
		this.version = version;
	}
	
	public String getName(){
		return name;
	}
	
	public String getVersion(){
		return version;
	}
}

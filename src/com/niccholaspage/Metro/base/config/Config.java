package com.niccholaspage.Metro.base.config;

public interface Config extends ConfigSection {
	public void setHeader(String header);
	
	public String getHeader();
	
	public void reload();
	
	public void save();
}

package com.niccholaspage.Metro.base.command;

public class Command {
	private final String name;
	
	public Command(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}

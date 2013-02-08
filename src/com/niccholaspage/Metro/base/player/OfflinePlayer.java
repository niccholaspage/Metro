package com.niccholaspage.Metro.base.player;

public class OfflinePlayer {
	private final String name;
	
	public OfflinePlayer(String name){
		this.name = name;
	}
	
	public OfflinePlayer(org.bukkit.OfflinePlayer player){
		this.name = player.getName();
	}
	
	public String getName(){
		return name;
	}
}

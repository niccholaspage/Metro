package com.niccholaspage.Metro.base.player;

public class MetroOfflinePlayer {
	private final String name;
	
	public MetroOfflinePlayer(String name){
		this.name = name;
	}
	
	public MetroOfflinePlayer(org.bukkit.OfflinePlayer player){
		this.name = player.getName();
	}
	
	public String getName(){
		return name;
	}
}

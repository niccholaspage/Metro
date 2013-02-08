package com.niccholaspage.Metro.base.player;

public class MetroPlayer {
	private final String name;
	
	public MetroPlayer(String name){
		this.name = name;
	}
	
	public MetroPlayer(org.bukkit.entity.Player player){
		this.name = player.getName();
	}
	
	public MetroPlayer(org.spout.api.entity.Player player){
		this.name = player.getName();
	}
	
	public String getName(){
		return name;
	}
}

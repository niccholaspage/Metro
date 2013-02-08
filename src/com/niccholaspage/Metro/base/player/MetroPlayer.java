package com.niccholaspage.Metro.base.player;

public class MetroPlayer extends MetroOfflinePlayer {
	public MetroPlayer(org.bukkit.entity.Player player){
		super(player);
	}
	
	public MetroPlayer(org.spout.api.entity.Player player){
		super(player.getName());
	}
}

package com.niccholaspage.Metro.base.player.players;

import org.bukkit.entity.Player;

public class BukkitPlayer extends com.niccholaspage.Metro.base.player.Player {
	private final Player player;
	
	public BukkitPlayer(Player player){
		super(player);
		
		this.player = player;
	}
	
	public void sendMessage(String message){
		player.sendMessage(message);
	}
}

package com.niccholaspage.Metro.base.player.players;

import org.spout.api.entity.Player;

public class SpoutPlayer extends com.niccholaspage.Metro.base.player.Player {
	private final Player player;
	
	public SpoutPlayer(Player player){
		super(player);
		
		this.player = player;
	}
	
	public void sendMessage(String message){
		player.sendMessage(message);
	}
}
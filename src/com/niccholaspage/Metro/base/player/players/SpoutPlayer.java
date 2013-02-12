package com.niccholaspage.Metro.base.player.players;

import org.spout.api.chat.ChatArguments;
import org.spout.api.entity.Player;

public class SpoutPlayer extends com.niccholaspage.Metro.base.player.Player {
	private final Player player;
	
	public SpoutPlayer(Player player){
		super(player.getName());
		
		this.player = player;
	}
	
	public void sendMessage(String message){
		player.sendMessage(ChatArguments.fromFormatString(message));
	}
	
	public boolean hasPermission(String permission){
		return player.hasPermission(permission);
	}
}

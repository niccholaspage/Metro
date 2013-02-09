package com.niccholaspage.Metro.base.player;

import com.niccholaspage.Metro.base.command.CommandSender;

public abstract class Player extends OfflinePlayer implements CommandSender {
	public Player(org.bukkit.entity.Player player){
		super(player);
	}
	
	public Player(org.spout.api.entity.Player player){
		super(player.getName());
	}
}

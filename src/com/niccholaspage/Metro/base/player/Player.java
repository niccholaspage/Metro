package com.niccholaspage.Metro.base.player;

import com.niccholaspage.Metro.base.command.CommandSender;

public abstract class Player extends OfflinePlayer implements CommandSender {
	public Player(String name){
		super(name);
	}
}

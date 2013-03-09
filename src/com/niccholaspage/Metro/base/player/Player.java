package com.niccholaspage.Metro.base.player;

import com.niccholaspage.Metro.base.command.CommandSender;
import com.niccholaspage.Metro.world.World;

public abstract class Player extends OfflinePlayer implements CommandSender {
	public Player(String name){
		super(name);
	}
	
	public abstract void setDisplayName(String name);
	
	public abstract String getDisplayName();
	
	public abstract World getWorld();
}

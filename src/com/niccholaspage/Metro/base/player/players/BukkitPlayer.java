package com.niccholaspage.Metro.base.player.players;

import org.bukkit.entity.Player;

import com.niccholaspage.Metro.world.World;
import com.niccholaspage.Metro.world.worlds.BukkitWorld;

public class BukkitPlayer extends com.niccholaspage.Metro.base.player.Player {
	private final Player player;
	
	public BukkitPlayer(Player player){
		super(player.getName());
		
		this.player = player;
	}
	
	public void sendMessage(String message){
		player.sendMessage(message);
	}
	
	public boolean hasPermission(String permission){
		return player.hasPermission(permission);
	}
	
	public String getDisplayName(){
		return player.getDisplayName();
	}
	
	public World getWorld(){
		return new BukkitWorld(player.getWorld());
	}
}

package com.niccholaspage.Metro.world.worlds;

import org.bukkit.World;

public class BukkitWorld implements com.niccholaspage.Metro.world.World {
	private final World world;
	
	public BukkitWorld(World world){
		this.world = world;
	}
	
	public String getName(){
		return world.getName();
	}
}

package com.niccholaspage.Metro.world.worlds;

import org.spout.api.geo.World;

public class SpoutWorld implements com.niccholaspage.Metro.world.World {
	private final World world;
	
	public SpoutWorld(World world){
		this.world = world;
	}
	
	public String getName(){
		return world.getName();
	}
}

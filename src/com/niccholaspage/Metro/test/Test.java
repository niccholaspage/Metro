package com.niccholaspage.Metro.test;

import com.niccholaspage.Metro.base.MetroPlugin;
import com.niccholaspage.Metro.base.player.MetroPlayer;

public class Test extends MetroPlugin {
	public void onEnable(){
		getLogger().info("Gaben");
		
		getServer().broadcastMessage("lol Gabe");
		
		for (MetroPlayer player : getServer().getOnlinePlayers()){
			getLogger().info(player.getName());
		}
	}
}

package com.niccholaspage.Metro.test;

import com.niccholaspage.Metro.base.MetroPlugin;
import com.niccholaspage.Metro.base.player.MetroOfflinePlayer;
import com.niccholaspage.Metro.base.player.MetroPlayer;

public class Test extends MetroPlugin {
	public void onEnable(){
		getLogger().info("Gaben");
		
		getServer().broadcastMessage("lol Gabe");
		
		getLogger().info("Online Players:");
		
		for (MetroPlayer player : getServer().getOnlinePlayers()){
			getLogger().info(player.getName());
		}
		
		getLogger().info("Offline Players:");
		
		for (MetroOfflinePlayer player : getServer().getOfflinePlayers()){
			getLogger().info(player.getName());
		}
	}
}

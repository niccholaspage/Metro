package com.niccholaspage.Metro.test;

import com.niccholaspage.Metro.base.MetroPlugin;
import com.niccholaspage.Metro.base.player.OfflinePlayer;
import com.niccholaspage.Metro.base.player.Player;

public class Test extends MetroPlugin {
	public void onEnable(){
		getLogger().info("Gaben");
		
		getServer().broadcastMessage("lol Gabe");
		
		getLogger().info("Online Players:");
		
		for (Player player : getServer().getOnlinePlayers()){
			getLogger().info(player.getName());
		}
		
		getLogger().info("Offline Players:");
		
		for (OfflinePlayer player : getServer().getOfflinePlayers()){
			getLogger().info(player.getName());
		}
	}
}

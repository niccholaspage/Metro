package com.niccholaspage.Metro.test;

import com.niccholaspage.Metro.base.MetroPlugin;
import com.niccholaspage.Metro.base.player.OfflinePlayer;
import com.niccholaspage.Metro.base.player.Player;

public class Test extends MetroPlugin {
	public void onEnable(){
		getServer().broadcastMessage("lol Gabe");
		
		log("Online Players:");
		
		for (Player player : getServer().getOnlinePlayers()){
			log(player.getName());
			
			player.sendMessage("Testing the gaben");
		}
		
		log("Offline Players:");
		
		for (OfflinePlayer player : getServer().getOfflinePlayers()){
			log(player.getName());
		}
		
		getConfig().setValue("gaben", 123);
		getConfig().setValue("test", "testing");
		
		getConfig().createConfigSection("testtwo");
		
		log(getConfig().getValue("gaben") + "");
		
		log(getDataFolder().getPath());
		
		getConfig().save();
		
		log(getResources().getFileResource("config.yml") + "");
		
		getResources().registerCommand("metro", new MetroCommandExecutor(this));
		
		log("Enabled - " + getResources().getName() + " " + getResources().getVersion() + " running on " + getServer().getVersion());
	}
	
	public void onDisable(){
		log("Disabled");
	}
}

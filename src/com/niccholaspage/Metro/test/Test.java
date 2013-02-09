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
		
		getConfig().setHeader("Gaben is awesome - Swag\n" +
		"More gaben testing\n" +
				"Last test\n");
		
		getConfig().addDefault("gaben", 123);
		getConfig().setValue("test", "testing");
		
		getConfig().createConfigSection("testtwo");
		
		getConfig().save();
		
		log(getConfig().getInt("gaben") + "");
		
		log(getDataFolder().getPath());
		
		log(getResources().getFileResource("config.yml") + "");
		
		getResources().registerCommand("metro", new MetroCommandExecutor());
		
		log(getServer().getPlugin("Metro") + "");
		log(getServer().getPlugin("WorldEdit") + "");
		
		log("Enabled - " + getResources().getName() + " " + getResources().getVersion() + " running on " + getServer().getVersion());
	}
	
	public void onDisable(){
		log("Disabled");
	}
}

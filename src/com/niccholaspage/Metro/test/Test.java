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
		
		MetroPlugin plugin = getServer().getPlugin("Metro");
		
		logPlugin(plugin);
		
		MetroPlugin worldEdit = getServer().getPlugin("WorldEdit");
		
		if (worldEdit != null){
			logPlugin(worldEdit);
			
			getServer().disablePlugin(worldEdit);
		}
		
		log("Enabled - " + getResources().getName() + " " + getResources().getVersion() + " running on " + getServer().getVersion());
		
		getServer().disablePlugin(this);
	}
	
	public void logPlugin(MetroPlugin plugin){
		log(plugin.getResources().getName() + " v" + plugin.getResources().getVersion() + ", " + plugin.getDataFolder());
	}
	
	public void onDisable(){
		log("Disabled");
	}
}

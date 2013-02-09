package com.niccholaspage.Metro.base.loader;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

import com.niccholaspage.Metro.base.MetroPlugin;
import com.niccholaspage.Metro.base.config.configs.BukkitConfig;
import com.niccholaspage.Metro.base.server.servers.BukkitServer;


public class BukkitLoader extends JavaPlugin {
	private MetroPlugin plugin = null;
	
	public void onEnable(){
		plugin.intialize(new BukkitServer(getServer()), getServer().getLogger(), new BukkitConfig(new File(getDataFolder(), "config.yml")));
		
		plugin.onEnable();
	}
	
	public void onDisable(){
		plugin.onDisable();
	}
	
	public void setPlugin(MetroPlugin plugin){
		this.plugin = plugin;
	}
}

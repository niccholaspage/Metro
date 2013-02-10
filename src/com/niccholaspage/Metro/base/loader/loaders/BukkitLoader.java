package com.niccholaspage.Metro.base.loader.loaders;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

import com.niccholaspage.Metro.base.MetroPlugin;
import com.niccholaspage.Metro.base.PluginResources;
import com.niccholaspage.Metro.base.config.configs.BukkitConfig;
import com.niccholaspage.Metro.base.resources.BukkitPluginResources;
import com.niccholaspage.Metro.base.server.servers.BukkitServer;


public class BukkitLoader extends JavaPlugin {
	private MetroPlugin plugin = null;
	
	public void onEnable(){
		PluginResources resources = new BukkitPluginResources(this, getDescription().getName(), getDescription().getVersion());
		
		plugin.intialize(resources, new BukkitServer(getServer()), getServer().getLogger(), new BukkitConfig(new File(getDataFolder(), "config.yml")), getDataFolder());
		
		plugin.onEnable();
	}
	
	public void onDisable(){
		plugin.onDisable();
	}
	
	public void setPlugin(MetroPlugin plugin){
		this.plugin = plugin;
	}
}

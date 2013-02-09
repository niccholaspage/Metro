package com.niccholaspage.Metro.base.loader;

import java.io.File;

import org.spout.api.plugin.CommonPlugin;

import com.niccholaspage.Metro.base.MetroPlugin;
import com.niccholaspage.Metro.base.config.configs.SpoutConfig;
import com.niccholaspage.Metro.base.server.servers.SpoutServer;


public class SpoutLoader extends CommonPlugin {
	private MetroPlugin plugin = null;
	
	public void onEnable(){
		plugin.intialize(new SpoutServer(getEngine()), getLogger(), new SpoutConfig(new File(getDataFolder(), "config.yml")));
		
		plugin.onEnable();
	}
	
	public void onDisable(){
		plugin.onDisable();
	}
	
	public void setPlugin(MetroPlugin plugin){
		this.plugin = plugin;
	}
}

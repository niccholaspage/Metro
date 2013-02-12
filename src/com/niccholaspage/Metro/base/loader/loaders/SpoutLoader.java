package com.niccholaspage.Metro.base.loader.loaders;

import java.io.File;

import org.spout.api.plugin.CommonPlugin;

import com.niccholaspage.Metro.base.MetroPlugin;
import com.niccholaspage.Metro.base.PluginResources;
import com.niccholaspage.Metro.base.chat.ChatFormat;
import com.niccholaspage.Metro.base.chat.SpoutChatFormat;
import com.niccholaspage.Metro.base.config.configs.SpoutConfig;
import com.niccholaspage.Metro.base.resources.SpoutPluginResources;
import com.niccholaspage.Metro.base.server.servers.SpoutServer;


public class SpoutLoader extends CommonPlugin {
	private MetroPlugin plugin = null;
	
	public SpoutLoader(){
		setupChatStyles();
	}
	
	public void onEnable(){
		PluginResources resources = new SpoutPluginResources(this, getDescription().getName(), getDescription().getVersion());
		
		plugin.intialize(resources, new SpoutServer(getEngine()), getLogger(), new SpoutConfig(this, new File(getDataFolder(), "config.yml"), "config.yml"), getDataFolder());
		
		plugin.onEnable();
	}
	
	private void setupChatStyles(){
		ChatFormat.BLACK = new SpoutChatFormat("BLACK");
		ChatFormat.DARK_BLUE = new SpoutChatFormat("DARK_BLUE");
		ChatFormat.DARK_GREEN = new SpoutChatFormat("DARK_GREEN");
		ChatFormat.DARK_AQUA = new SpoutChatFormat("DARK_CYAN");
		ChatFormat.DARK_RED = new SpoutChatFormat("DARK_RED");
		ChatFormat.DARK_PURPLE = new SpoutChatFormat("PURPLE");
		ChatFormat.GOLD = new SpoutChatFormat("GOLD");
		ChatFormat.GRAY = new SpoutChatFormat("GRAY");
		ChatFormat.DARK_GRAY = new SpoutChatFormat("DARK_GRAY");
		ChatFormat.BLUE = new SpoutChatFormat("BLUE");
		ChatFormat.GREEN = new SpoutChatFormat("BRIGHT_GREEN");
		ChatFormat.AQUA = new SpoutChatFormat("CYAN");
		ChatFormat.RED = new SpoutChatFormat("RED");
		ChatFormat.LIGHT_PURPLE = new SpoutChatFormat("PINK");
		ChatFormat.YELLOW = new SpoutChatFormat("YELLOW");
		ChatFormat.WHITE = new SpoutChatFormat("WHITE");
		ChatFormat.MAGIC = new SpoutChatFormat("CONCEAL");
		ChatFormat.BOLD = new SpoutChatFormat("BOLD");
		ChatFormat.STRIKETHROUGH = new SpoutChatFormat("STRIKE_THROUGH");
		ChatFormat.UNDERLINE = new SpoutChatFormat("UNDERLINE");
		ChatFormat.ITALIC = new SpoutChatFormat("ITALIC");
		ChatFormat.RESET = new SpoutChatFormat("RESET");
	}
	
	public void onDisable(){
		plugin.onDisable();
	}
	
	public void setPlugin(MetroPlugin plugin){
		this.plugin = plugin;
	}
}

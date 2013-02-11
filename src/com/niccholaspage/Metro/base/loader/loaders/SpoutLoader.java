package com.niccholaspage.Metro.base.loader.loaders;

import java.io.File;

import org.spout.api.chat.style.ChatStyle;
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
		ChatFormat.BLACK = new SpoutChatFormat(ChatStyle.BLACK);
		ChatFormat.DARK_BLUE = new SpoutChatFormat(ChatStyle.DARK_BLUE);
		ChatFormat.DARK_GREEN = new SpoutChatFormat(ChatStyle.DARK_GREEN);
		ChatFormat.DARK_AQUA = new SpoutChatFormat(ChatStyle.DARK_CYAN);
		ChatFormat.DARK_RED = new SpoutChatFormat(ChatStyle.DARK_RED);
		ChatFormat.DARK_PURPLE = new SpoutChatFormat(ChatStyle.PURPLE);
		ChatFormat.GOLD = new SpoutChatFormat(ChatStyle.GOLD);
		ChatFormat.GRAY = new SpoutChatFormat(ChatStyle.GRAY);
		ChatFormat.DARK_GRAY = new SpoutChatFormat(ChatStyle.DARK_GRAY);
		ChatFormat.BLUE = new SpoutChatFormat(ChatStyle.BLUE);
		ChatFormat.GREEN = new SpoutChatFormat(ChatStyle.BRIGHT_GREEN);
		ChatFormat.AQUA = new SpoutChatFormat(ChatStyle.CYAN);
		ChatFormat.RED = new SpoutChatFormat(ChatStyle.RED);
		ChatFormat.LIGHT_PURPLE = new SpoutChatFormat(ChatStyle.PINK);
		ChatFormat.YELLOW = new SpoutChatFormat(ChatStyle.YELLOW);
		ChatFormat.WHITE = new SpoutChatFormat(ChatStyle.WHITE);
		ChatFormat.MAGIC = new SpoutChatFormat(ChatStyle.CONCEAL);
		ChatFormat.BOLD = new SpoutChatFormat(ChatStyle.BOLD);
		ChatFormat.STRIKETHROUGH = new SpoutChatFormat(ChatStyle.STRIKE_THROUGH);
		ChatFormat.UNDERLINE = new SpoutChatFormat(ChatStyle.UNDERLINE);
		ChatFormat.ITALIC = new SpoutChatFormat(ChatStyle.ITALIC);
		ChatFormat.RESET = new SpoutChatFormat(ChatStyle.RESET);
	}
	
	public void onDisable(){
		plugin.onDisable();
	}
	
	public void setPlugin(MetroPlugin plugin){
		this.plugin = plugin;
	}
}

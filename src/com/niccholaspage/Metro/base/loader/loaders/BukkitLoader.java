package com.niccholaspage.Metro.base.loader.loaders;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import com.niccholaspage.Metro.base.MetroPlugin;
import com.niccholaspage.Metro.base.PluginResources;
import com.niccholaspage.Metro.base.chat.BukkitChatFormat;
import com.niccholaspage.Metro.base.chat.ChatFormat;
import com.niccholaspage.Metro.base.config.configs.BukkitConfig;
import com.niccholaspage.Metro.base.resources.BukkitPluginResources;
import com.niccholaspage.Metro.base.server.servers.BukkitServer;


public class BukkitLoader extends JavaPlugin {
	private MetroPlugin plugin = null;
	
	public BukkitLoader(){
		setupChatColors();
	}
	
	public void onEnable(){
		PluginResources resources = new BukkitPluginResources(this, getDescription().getName(), getDescription().getVersion());
		
		plugin.intialize(resources, new BukkitServer(getServer()), getServer().getLogger(), new BukkitConfig(this, new File(getDataFolder(), "config.yml"), "config.yml"), getDataFolder());
		
		plugin.onEnable();
	}
	
	private void setupChatColors(){
		ChatFormat.BLACK = new BukkitChatFormat(ChatColor.BLACK);
		ChatFormat.DARK_BLUE = new BukkitChatFormat(ChatColor.DARK_BLUE);
		ChatFormat.DARK_GREEN = new BukkitChatFormat(ChatColor.DARK_GREEN);
		ChatFormat.DARK_AQUA = new BukkitChatFormat(ChatColor.DARK_AQUA);
		ChatFormat.DARK_RED = new BukkitChatFormat(ChatColor.DARK_RED);
		ChatFormat.DARK_PURPLE = new BukkitChatFormat(ChatColor.DARK_PURPLE);
		ChatFormat.GOLD = new BukkitChatFormat(ChatColor.GOLD);
		ChatFormat.GRAY = new BukkitChatFormat(ChatColor.GRAY);
		ChatFormat.DARK_GRAY = new BukkitChatFormat(ChatColor.DARK_GRAY);
		ChatFormat.BLUE = new BukkitChatFormat(ChatColor.BLUE);
		ChatFormat.GREEN = new BukkitChatFormat(ChatColor.GREEN);
		ChatFormat.AQUA = new BukkitChatFormat(ChatColor.AQUA);
		ChatFormat.RED = new BukkitChatFormat(ChatColor.RED);
		ChatFormat.LIGHT_PURPLE = new BukkitChatFormat(ChatColor.LIGHT_PURPLE);
		ChatFormat.YELLOW = new BukkitChatFormat(ChatColor.YELLOW);
		ChatFormat.WHITE = new BukkitChatFormat(ChatColor.WHITE);
		ChatFormat.MAGIC = new BukkitChatFormat(ChatColor.MAGIC);
		ChatFormat.BOLD = new BukkitChatFormat(ChatColor.BOLD);
		ChatFormat.STRIKETHROUGH = new BukkitChatFormat(ChatColor.STRIKETHROUGH);
		ChatFormat.UNDERLINE = new BukkitChatFormat(ChatColor.UNDERLINE);
		ChatFormat.ITALIC = new BukkitChatFormat(ChatColor.ITALIC);
		ChatFormat.RESET = new BukkitChatFormat(ChatColor.RESET);
	}
	
	public void onDisable(){
		plugin.onDisable();
	}
	
	public void setPlugin(MetroPlugin plugin){
		this.plugin = plugin;
	}
}

package com.niccholaspage.Metro.base.chat;

import org.bukkit.ChatColor;

public class BukkitChatFormat extends ChatFormat {
	private final ChatColor color;
	
	public BukkitChatFormat(ChatColor color){
		this.color = color;
	}
	
	public String toString(){
		return color + "";
	}
}

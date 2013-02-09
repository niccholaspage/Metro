package com.niccholaspage.Metro.base.command;

public class BukkitCommandSender implements CommandSender {
	private final org.bukkit.command.CommandSender sender;
	
	public BukkitCommandSender(org.bukkit.command.CommandSender sender){
		this.sender = sender;
	}
	
	public String getName(){
		return sender.getName();
	}
	
	public void sendMessage(String message){
		sender.sendMessage(message);
	}

	public boolean hasPermission(String permission){
		return sender.hasPermission(permission);
	}
}

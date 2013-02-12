package com.niccholaspage.Metro.base.command;

import org.spout.api.chat.ChatArguments;

public class SpoutCommandSender implements CommandSender {
	private final org.spout.api.command.CommandSource source;
	
	public SpoutCommandSender(org.spout.api.command.CommandSource source){
		this.source = source;
	}
	
	public String getName(){
		return source.getName();
	}
	
	public void sendMessage(String message){
		source.sendMessage(ChatArguments.fromFormatString(message));
	}

	public boolean hasPermission(String permission){
		return source.hasPermission(permission);
	}
}

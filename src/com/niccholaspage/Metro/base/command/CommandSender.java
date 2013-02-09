package com.niccholaspage.Metro.base.command;

public interface CommandSender {
	public abstract String getName();
	
	public abstract void sendMessage(String message);
	
	public abstract boolean hasPermission(String permission);
}

package com.niccholaspage.Metro.base.command;


public interface CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args);
}

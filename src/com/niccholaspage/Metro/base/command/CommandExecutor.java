package com.niccholaspage.Metro.base.command;

import com.niccholaspage.Metro.base.messaging.CommandSender;

public interface CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args);
}

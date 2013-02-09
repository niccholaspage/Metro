package com.niccholaspage.Metro.test;

import com.niccholaspage.Metro.base.command.Command;
import com.niccholaspage.Metro.base.command.CommandExecutor;
import com.niccholaspage.Metro.base.command.CommandSender;

public class MetroCommandExecutor implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		sender.sendMessage(sender.getName() + "(You) used " + commandLabel + "!");
		
		for (int i = 0; i < args.length; i++){
			sender.sendMessage(args[i]);
		}
		
		return true;
	}

}

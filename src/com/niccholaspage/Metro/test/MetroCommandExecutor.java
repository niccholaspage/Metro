package com.niccholaspage.Metro.test;

import com.niccholaspage.Metro.base.command.Command;
import com.niccholaspage.Metro.base.command.CommandExecutor;
import com.niccholaspage.Metro.base.messaging.CommandSender;

public class MetroCommandExecutor implements CommandExecutor {
	private final Test plugin;
	
	public MetroCommandExecutor(Test plugin){
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		plugin.log("Someone used " + commandLabel + "!");
		
		for (int i = 0; i < args.length; i++){
			plugin.log(args[i]);
		}
		
		return true;
	}

}

package com.niccholaspage.Metro.base.command;

import org.bukkit.entity.Player;

import com.niccholaspage.Metro.base.player.players.BukkitPlayer;

public class BukkitCommandExecutor implements org.bukkit.command.CommandExecutor {
	private final CommandExecutor executor;
	
	public BukkitCommandExecutor(CommandExecutor executor){
		this.executor = executor;
	}
	
	public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command cmd, String commandLabel, String[] args){
		CommandSender newSender;
		
		if (sender instanceof Player){
			newSender = new BukkitPlayer((Player) sender);
		}else {
			newSender = new BukkitCommandSender(sender);
		}
		
		executor.onCommand(newSender, new Command(cmd.getName()), commandLabel, args);
		
		return true;
	}
}

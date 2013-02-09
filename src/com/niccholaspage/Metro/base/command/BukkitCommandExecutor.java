package com.niccholaspage.Metro.base.command;

public class BukkitCommandExecutor implements org.bukkit.command.CommandExecutor {
	private final CommandExecutor executor;
	
	public BukkitCommandExecutor(CommandExecutor executor){
		this.executor = executor;
	}
	
	public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command cmd, String commandLabel, String[] args){
		executor.onCommand(new BukkitCommandSender(sender), new Command(cmd.getName()), commandLabel, args);
		
		return true;
	}
}

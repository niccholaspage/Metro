package com.niccholaspage.Metro.base.command;

import org.spout.api.command.CommandContext;
import org.spout.api.command.CommandSource;
import org.spout.api.exception.CommandException;
import org.spout.api.entity.Player;

import com.niccholaspage.Metro.base.player.players.SpoutPlayer;

public class SpoutCommandExecutor implements org.spout.api.command.CommandExecutor {
	private final CommandExecutor executor;
	
	public SpoutCommandExecutor(CommandExecutor executor){
		this.executor = executor;
	}
	
	public void processCommand(CommandSource source, org.spout.api.command.Command cmd, CommandContext context) throws CommandException {
		String[] args = new String[context.length()];
		
		for (int i = 0; i < args.length; i++){
			args[i] = context.getString(i);
		}
		
		CommandSender sender;
		
		if (source instanceof Player){
			sender = new SpoutPlayer((Player) source);
		}else {
			sender = new SpoutCommandSender(source);
		}
		
		executor.onCommand(sender, new Command(cmd.getPreferredName()), cmd.getPreferredName(), args);
	}
}

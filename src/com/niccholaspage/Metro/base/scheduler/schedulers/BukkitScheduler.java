package com.niccholaspage.Metro.base.scheduler.schedulers;

import org.bukkit.Server;
import org.bukkit.plugin.Plugin;

import com.niccholaspage.Metro.base.MetroPlugin;
import com.niccholaspage.Metro.base.scheduler.Scheduler;

public class BukkitScheduler implements Scheduler {
	private final Server server;
	
	public BukkitScheduler(Server server){
		this.server = server;
	}
	
	public Plugin getBukkitPlugin(MetroPlugin plugin){
		return server.getPluginManager().getPlugin(plugin.getResources().getName());
	}
	
	public void runTask(MetroPlugin plugin, Runnable task){
		server.getScheduler().runTask(getBukkitPlugin(plugin), task);
	}
	
	public void runTaskAsynchronously(MetroPlugin plugin, Runnable task){
		server.getScheduler().runTaskAsynchronously(getBukkitPlugin(plugin), task);
	}

	public void runTaskLater(MetroPlugin plugin, Runnable task, long delay){
		server.getScheduler().runTaskLater(getBukkitPlugin(plugin), task, delay);
	}

	public void runTaskLaterAsynchronously(MetroPlugin plugin, Runnable task, long delay){
		server.getScheduler().runTaskLaterAsynchronously(getBukkitPlugin(plugin), task, delay);
	}

	public void runTaskTimer(MetroPlugin plugin, Runnable task, long delay, long period){
		server.getScheduler().runTaskTimer(getBukkitPlugin(plugin), task, delay, period);
	}
}

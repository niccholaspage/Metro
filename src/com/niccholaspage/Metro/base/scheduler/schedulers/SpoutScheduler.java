package com.niccholaspage.Metro.base.scheduler.schedulers;

import org.spout.api.Server;
import org.spout.api.plugin.Plugin;
import org.spout.api.scheduler.TaskPriority;

import com.niccholaspage.Metro.base.MetroPlugin;
import com.niccholaspage.Metro.base.scheduler.Scheduler;

public class SpoutScheduler implements Scheduler{
	private final Server server;
	
	public SpoutScheduler(Server server){
		this.server = server;
	}
	
	public Plugin getSpoutPlugin(MetroPlugin plugin){
		return server.getPluginManager().getPlugin(plugin.getResources().getName());
	}

	
	public void runTask(MetroPlugin plugin, Runnable task){
		server.getScheduler().scheduleSyncDelayedTask(getSpoutPlugin(plugin), task);
	}

	
	public void runTaskAsynchronously(MetroPlugin plugin, Runnable task){
		server.getScheduler().scheduleAsyncDelayedTask(getSpoutPlugin(plugin), task, 0, TaskPriority.NORMAL);
	}

	
	public void runTaskLater(MetroPlugin plugin, Runnable task, long delay){
		server.getScheduler().scheduleSyncDelayedTask(getSpoutPlugin(plugin), task, delay, TaskPriority.NORMAL);
	}

	
	public void runTaskLaterAsynchronously(MetroPlugin plugin, Runnable task, long delay){
		server.getScheduler().scheduleAsyncDelayedTask(getSpoutPlugin(plugin), task, delay, TaskPriority.NORMAL);
	}

	
	public void runTaskTimer(MetroPlugin plugin, Runnable task, long delay, long period){
		server.getScheduler().scheduleSyncRepeatingTask(getSpoutPlugin(plugin), task, delay, period, TaskPriority.NORMAL);
	}
}

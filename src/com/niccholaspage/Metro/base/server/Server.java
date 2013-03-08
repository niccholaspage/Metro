package com.niccholaspage.Metro.base.server;

import java.util.List;

import com.niccholaspage.Metro.base.MetroPlugin;
import com.niccholaspage.Metro.base.player.OfflinePlayer;
import com.niccholaspage.Metro.base.player.Player;
import com.niccholaspage.Metro.base.scheduler.Scheduler;
import com.niccholaspage.Metro.world.World;

public interface Server {
	public ServerType getType();
	
	public String getVersion();
	
	public void broadcastMessage(String message);
	
	public Player getOnlinePlayer(String name, boolean exact);
	
	public List<Player> getOnlinePlayers();
	
	public OfflinePlayer getOfflinePlayer(String name);
	
	public List<OfflinePlayer> getOfflinePlayers();
	
	public World getWorld(String name);
	
	public MetroPlugin getPlugin(String name);
	
	public void disablePlugin(MetroPlugin plugin);
	
	public Scheduler getScheduler();
}

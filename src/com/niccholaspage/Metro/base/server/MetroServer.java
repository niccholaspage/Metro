package com.niccholaspage.Metro.base.server;

import java.util.List;

import com.niccholaspage.Metro.base.player.MetroOfflinePlayer;
import com.niccholaspage.Metro.base.player.MetroPlayer;

public interface MetroServer {
	public void broadcastMessage(String message);
	
	public List<MetroPlayer> getOnlinePlayers();
	
	public MetroOfflinePlayer getOfflinePlayer(String name);
}

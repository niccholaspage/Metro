package com.niccholaspage.Metro.base.server;

import java.util.List;

import com.niccholaspage.Metro.base.player.OfflinePlayer;
import com.niccholaspage.Metro.base.player.Player;

public interface Server {
	public void broadcastMessage(String message);
	
	public Player getOnlinePlayer(String name, boolean exact);
	
	public List<Player> getOnlinePlayers();
	
	public OfflinePlayer getOfflinePlayer(String name);
	
	public List<OfflinePlayer> getOfflinePlayers();
}

package base.loader;

import org.bukkit.plugin.java.JavaPlugin;

import base.MetroPlugin;
import base.server.servers.BukkitServer;

public class BukkitLoader extends JavaPlugin {
	private MetroPlugin plugin = null;
	
	public void onEnable(){
		plugin.intialize(new BukkitServer(getServer()), getServer().getLogger());
		
		plugin.onEnable();
	}
	
	public void onDisable(){
		plugin.onDisable();
	}
	
	public void setPlugin(MetroPlugin plugin){
		this.plugin = plugin;
	}
}

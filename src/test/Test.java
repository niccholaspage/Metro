package test;

import base.MetroPlugin;

public class Test extends MetroPlugin {
	public void onEnable(){
		getLogger().info("Gaben");
		
		getServer().broadcastMessage("lol Gabe");
	}
}

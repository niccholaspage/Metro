package test;

import base.loader.BukkitLoader;

public class TestBukkitLoader extends BukkitLoader {
	public void onEnable(){
		setPlugin(new Test());
		
		super.onEnable();
	}
}

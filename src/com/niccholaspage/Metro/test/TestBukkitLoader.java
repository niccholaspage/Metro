package com.niccholaspage.Metro.test;

import com.niccholaspage.Metro.base.loader.loaders.BukkitLoader;

public class TestBukkitLoader extends BukkitLoader {
	public void onEnable(){
		setPlugin(new Test());
		
		super.onEnable();
	}
}

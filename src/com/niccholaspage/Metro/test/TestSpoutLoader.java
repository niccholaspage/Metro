package com.niccholaspage.Metro.test;

import com.niccholaspage.Metro.base.loader.SpoutLoader;

public class TestSpoutLoader extends SpoutLoader {
	public void onEnable(){
		setPlugin(new Test());
		
		super.onEnable();
	}
}
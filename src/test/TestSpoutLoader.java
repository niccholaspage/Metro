package test;

import base.loader.SpoutLoader;

public class TestSpoutLoader extends SpoutLoader {
	public void onEnable(){
		setPlugin(new Test());
		
		super.onEnable();
	}
}

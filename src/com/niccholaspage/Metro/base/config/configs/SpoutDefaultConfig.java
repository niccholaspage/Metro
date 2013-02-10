package com.niccholaspage.Metro.base.config.configs;

import java.io.File;
import java.io.InputStream;
import java.util.Set;

import org.spout.api.plugin.CommonPlugin;
import org.spout.api.util.config.Configuration;
import org.spout.api.util.config.yaml.YamlConfiguration;


public class SpoutDefaultConfig extends SpoutConfig {
	private final CommonPlugin plugin;
	
	public SpoutDefaultConfig(CommonPlugin plugin, File file){
		super(file);
		
		this.plugin = plugin;
	}
	
	public void reload(){
		super.reload();
		
        InputStream defConfigStream = plugin.getResource("config.yml");
        
        if (defConfigStream != null) {
            Configuration defConfig = new YamlConfiguration(defConfigStream);

    		Set<String> keys = defConfig.getKeys(true);
    		
    		for (String key : keys){
    			addDefault(key, getValue(key));
    		}
        }
	}
}

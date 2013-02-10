package com.niccholaspage.Metro.base.config.configs;

import java.io.File;
import java.io.InputStream;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitDefaultConfig extends BukkitConfig {
	private final JavaPlugin plugin;
	
	public BukkitDefaultConfig(JavaPlugin plugin, File file){
		super(file);
		
		this.plugin = plugin;
	}
	
	public void reload(){
		super.reload();
		
        InputStream defConfigStream = plugin.getResource("config.yml");
        
        if (defConfigStream != null) {
            YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);

            config.setDefaults(defConfig);
        }
	}
}

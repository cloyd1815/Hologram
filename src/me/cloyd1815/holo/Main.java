package me.cloyd1815.holo;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	private static Main plugin;
	@Override
	public void onEnable() {
		plugin = this;
		
	}
	
	@Override
	public void onDisable() {
		
	}

	public static Main getPlugin() {
		return plugin;
	}
}

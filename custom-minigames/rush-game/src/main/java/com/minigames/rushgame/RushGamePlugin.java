package com.minigames.rushgame;

import org.bukkit.plugin.java.JavaPlugin;

public class RushGamePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Rush Game plugin enabled!");

        // Initialize game manager
        // Register commands
        // Register listeners
    }

    @Override
    public void onDisable() {
        getLogger().info("Rush Game plugin disabled!");

        // Cleanup resources
        // Save data
    }
}
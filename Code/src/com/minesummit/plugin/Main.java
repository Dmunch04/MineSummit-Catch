package com.minesummit.plugin;

import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    // Sets up the permission
    public Permission admin = new Permission("MS.admin");

    // This method is called when the plugin is loaded
    @Override
    public void onEnable() {
        // Printing out a message to the console
        getLogger().info("MineSummit plugin has been enabled (v0.1)");

        // Calling the player listener
        new PlayerListener(this);

        new PrepareMatch();

        getCommand("start").setExecutor(new Start());

        // Add the permissions
        PluginManager pm = getServer().getPluginManager();
        pm.addPermission(admin);

    }

    // This method is called when the plugin is unloaded
    @Override
    public void onDisable() {

    }

}

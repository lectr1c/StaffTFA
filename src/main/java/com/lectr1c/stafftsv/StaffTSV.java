package com.lectr1c.stafftsv;

import com.lectr1c.stafftsv.config.Config;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class StaffTSV extends JavaPlugin {

    private static StaffTSV instance;

    private Config config;

    @Override
    public void onEnable() {
        instance = this;

        // Load global configs
        config = new Config("config.yml");
        
        // Plugin startup logic
        var player = getServer().getPlayer("TheLilBigBoss");
        getServer().getPluginManager().registerEvents(new OnPlayerChat(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public Config getConfig() {
        return config;
    }

    @Override
    public void reloadConfig() {
        config.reload();
    }

    @Override
    public void saveConfig() {
        config.save();
    }

    @Override
    public void saveDefaultConfig() {
        config.saveDefault();
    }
    // -- //

    public static StaffTSV instance() {
        return instance;
    }
}
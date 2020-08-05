package com.xbaimiao;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;
    public static Main plugin(){
        return instance;
    }

    @Override
    public void onEnable() {
        saveDefaultConfig();
        instance = this;
    }

}

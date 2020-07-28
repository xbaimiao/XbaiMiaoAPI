package com.xbaimiao;

import com.xbaimiao.config.Config;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{

    public static Main instance;

    Config data = new Config("data.yml");

    @Override
    public void onEnable() {
        saveDefaultConfig();
        instance = this;
        Bukkit.getPluginManager().registerEvents(this,this);
        data.getConfig().set("dasdas","dsadsa");
    }

    @EventHandler
    public void e(PlayerJoinEvent e){
        data.remove();
    }

}

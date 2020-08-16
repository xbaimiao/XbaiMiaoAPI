package com.xbaimiao;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    private static Main instance;
    public static Main plugin(){
        return instance;
    }

    @Override
    public void onEnable() {
        saveDefaultConfig();
        instance = this;
        Bukkit.getPluginManager().registerEvents(this,this);

    }


//
//    @EventHandler
//    public void test(@NotNull PlayerChatEvent event){
//        Bungees.connect(event.getPlayer(),"miaodalu");
//        System.out.println("正在将" +event.getPlayer().getName() +"传送至miaodalu");
//    }

}

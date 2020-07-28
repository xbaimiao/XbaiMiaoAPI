package com.xbaimiao;

import com.xbaimiao.config.Config;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{

    public static Main instance;

    Config data = new Config(this,"data.yml");

    @Override
    public void onEnable() {
        saveDefaultConfig();
        instance = this;
        Bukkit.getPluginManager().registerEvents(this,this);
        data.getConfig().set("dasdas","dsadsa");
        data.sava();
    }

//    @EventHandler
//    public void e(PlayerJoinEvent e){
//        e.getPlayer().getInventory().addItem(head());
//        data.remove();
//    }
//
//    private ItemStack head(){
//        Base64Head h = new Base64Head("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW" +
//                "5lY3JhZnQubmV0L3RleHR1cmUvYWU4ODkwODc0YTMwNjZmNDI2ZTY2ZTM3NDM4ZjQ1YWIyOWE1YmYyNTgyZGI3M2NiNGNmZjY5NTRhNTc4ZWYifX19");
//        h.setHeadName("测试");
//        return h.getHead();
//    }

}

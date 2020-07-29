package com.xbaimiao.TheAnvil;

import net.minecraft.server.v1_16_R1.ContainerAnvil;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_16_R1.inventory.CraftInventoryAnvil;
import org.bukkit.entity.Player;
import org.bukkit.inventory.AnvilInventory;

/*
* 铁砧的api
* */
public class TheAnvil {

    /*
    * 创建一个铁砧gui
    * */
    public void create(Player a){
        new CraftInventoryAnvil(a.getLocation(),null,null,null);
    }
}

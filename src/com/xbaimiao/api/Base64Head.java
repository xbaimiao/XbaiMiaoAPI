package com.xbaimiao.api;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.lang.reflect.Field;
import java.util.List;
import java.util.UUID;

public class Base64Head {

    private ItemStack item;
    private ItemMeta meta;

    public Base64Head(String base64) {
        ItemStack skull = new ItemStack(Material.PLAYER_HEAD, 1);
        SkullMeta skullmate = (SkullMeta) skull.getItemMeta();
        assert skullmate != null;
        GameProfile profile = new GameProfile(UUID.randomUUID(), null);
        profile.getProperties().put("textures", new Property("textures", base64));
        try {
            Field field = skullmate.getClass().getDeclaredField("profile");
            field.setAccessible(true);
            field.set(skullmate, profile);
            skull.setItemMeta(skullmate);
            this.item = skull;
            this.meta = skullmate;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public ItemStack getHead() {
        return item;
    }

    public void setHeadName(String name) {
        meta.setDisplayName(name);
        item.setItemMeta(meta);
    }

    public void setHeadLore(List<String> list) {
        meta.setLore(list);
        item.setItemMeta(meta);
    }
}

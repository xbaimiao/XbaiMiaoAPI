package com.xbaimiao.api;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Config {

    private final File file;
    private final YamlConfiguration config;

    public Config(Plugin plugin, String filename) {
        file = new File(plugin.getDataFolder(), filename);
        try {
            File ParentFile = file.getParentFile();
            if (!ParentFile.exists()) {
                ParentFile.mkdirs();
            }
            if (!file.exists()) {
                if (file.createNewFile()) {
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file.getPath()), StandardCharsets.UTF_8));
                    bw.write("#初始文件");
                    bw.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        config = YamlConfiguration.loadConfiguration(file);
    }

    public YamlConfiguration getConfig() {
        return config;
    }

    public File getFile() {
        return file;
    }

    public boolean remove() {
        return file.delete();
    }

    public boolean sava() {
        try {
            config.save(file);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}

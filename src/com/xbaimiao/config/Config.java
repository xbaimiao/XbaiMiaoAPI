package com.xbaimiao.config;

import com.xbaimiao.Main;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Config {

    private final File file;
    private final YamlConfiguration config;

    public Config(String filename){
        file = new File(Main.instance.getDataFolder(), filename);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        config = YamlConfiguration.loadConfiguration(file);
    }
    public YamlConfiguration getConfig(){
        return config;
    }

    public File getFile(){
        return file;
    }

    public boolean remove(){
        return file.delete();
    }

    /**
     * 保存配置文件
     * @return 成功为true 失败为false
     */
    public boolean sava(){
        try {
            config.save(file);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}

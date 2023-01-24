package com.agusces0;

import org.bukkit.plugin.java.JavaPlugin;

public class McPluginMaven extends JavaPlugin {

    @Override
    public void onLoad() {
        System.out.println("SI FUNCA");
    }

    @Override
    public void onDisable() {
        System.out.println("DEJO DE FUNCAR PERO TODO OK");
    }
}

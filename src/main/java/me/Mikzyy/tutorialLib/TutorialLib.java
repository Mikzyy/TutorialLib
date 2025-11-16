package me.Mikzyy.tutorialLib;

import org.bukkit.plugin.java.JavaPlugin;

public final class TutorialLib extends JavaPlugin {

    private static TutorialLib instance;

    private final JavaPlugin plugin;

    public TutorialLib(JavaPlugin plugin) {
        instance = this;
        this.plugin = plugin;
    }

    public static TutorialLib getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public JavaPlugin getPlugin() {
        return plugin;
    }
}

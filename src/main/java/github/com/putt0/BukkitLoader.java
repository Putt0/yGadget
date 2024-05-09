package github.com.putt0;

import org.bukkit.plugin.Plugin;

public class BukkitLoader extends BukkitMain {

    protected static Plugin plugin;

    public static Plugin getPlugin() {
        return plugin;
    }

    @Override
    public void onLoad() {
        onLoadService();
    }

    @Override
    public void onEnable() {
        onEnableService();
    }

    @Override
    public void onDisable() {
        onDisableService();
    }
}
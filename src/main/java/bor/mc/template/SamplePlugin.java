package bor.mc.template;

import org.bukkit.plugin.java.JavaPlugin;

public class SamplePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");
    }
    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }

}

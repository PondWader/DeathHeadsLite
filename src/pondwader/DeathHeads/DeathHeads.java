package pondwader.DeathHeads;

import org.bukkit.plugin.java.JavaPlugin;

public class DeathHeads extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("DeathHeadsLite v0.1 by PondWader has been enabled.");
        getServer().getPluginManager().registerEvents(new Death(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("DeathHeadsLite has been disabled.");
    }
}

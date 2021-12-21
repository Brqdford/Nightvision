package com.brqdford.nightvision;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class nightvisionmain extends JavaPlugin {

    public void onEnable() {
        getCommand("nightvision").setExecutor(new nightvisioncommand());
        getCommand("banneditems").setExecutor(new banneditems());
    }

}

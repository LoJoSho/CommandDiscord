package me.lojosho.commanddiscord;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class CommandDiscord extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);
        this.saveDefaultConfig();
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(label.equalsIgnoreCase("discord")) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("discord")));
                return true;
            }
        return false;
    }
}

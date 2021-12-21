package com.brqdford.nightvision;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class banneditems implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player)sender;
            player.sendMessage(ChatColor.GOLD + "               Banned Items:");
            player.sendMessage(ChatColor.YELLOW + "All chunk loaders(Use our chunk loaders (ironblock, diamondblock))");
            player.sendMessage(ChatColor.YELLOW + "AntiBuilder");
            player.sendMessage(ChatColor.YELLOW + "Block Placer");
            player.sendMessage(ChatColor.YELLOW + "Cart Dispenser");
            player.sendMessage(ChatColor.YELLOW + "Dimension Builder");
            player.sendMessage(ChatColor.YELLOW + "Electromagnet");
            player.sendMessage(ChatColor.YELLOW + "Machinists Workbench");
            player.sendMessage(ChatColor.YELLOW + "Hopper Facade");
            player.sendMessage(ChatColor.YELLOW + "TnT carts");
            player.sendMessage(ChatColor.YELLOW + "Industrial tnt, sdx, dynamite, nuke");
            player.sendMessage(ChatColor.YELLOW + "Particle Generator (BloodMagic)");
            player.sendMessage(ChatColor.YELLOW + "Plasma Launcher");
            player.sendMessage(ChatColor.YELLOW + "Florbs");
            player.sendMessage(ChatColor.YELLOW + "Shape Cards");
            player.sendMessage(ChatColor.YELLOW + "Redstone Clock");
            player.sendMessage(ChatColor.YELLOW + "Item/liquid translocators");
            player.sendMessage(ChatColor.YELLOW + "Dolly/Diamond Dolly");
            player.sendMessage(ChatColor.YELLOW + "Teru teru bozu");
            player.sendMessage(ChatColor.YELLOW + "Weather obelisk");
            player.sendMessage(ChatColor.YELLOW + "Weather controller");
            player.sendMessage(ChatColor.YELLOW + "Sun dial");
            player.sendMessage(ChatColor.YELLOW + "Knapsack");
            player.sendMessage(ChatColor.YELLOW + "Cursor/Pointer");
            player.sendMessage(ChatColor.YELLOW + "Item eject/import covers");
            player.sendMessage(ChatColor.YELLOW + "Jailers Safari Net");
            player.sendMessage(ChatColor.YELLOW + "Magic Beans");
            player.sendMessage(ChatColor.YELLOW + "SPAMR Launcher");
            player.sendMessage(ChatColor.GOLD + "Mods removed: PortalGun, Mystcraft");

            return true;
        }
        return false;
    }
}

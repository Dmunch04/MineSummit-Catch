package com.minesummit.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Start implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player player = (Player) sender;

        player.sendMessage("This command works until now at least :P");

        PrepareMatch pm = new PrepareMatch();
        pm.CheckArenas(player);

        return true;
    }

}

package com.minesummit.plugin;

import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerListener implements Listener {

    public PlayerListener(Main plugin) {

        plugin.getServer().getPluginManager().registerEvents(this, plugin);

    }

    @EventHandler
    public void onSignClick(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        if (e.getClickedBlock().getType() == Material.SIGN || e.getClickedBlock().getType() == Material.WALL_SIGN) {
            if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
                Sign sign = (Sign) e.getClickedBlock().getState();
                //^^ .getState(); really important
                if (sign.getLine(0).equalsIgnoreCase("catch ball")) {
                    player.sendMessage("This works :P");
                    PrepareMatch pm = new PrepareMatch();
                    pm.CheckArenas(player);
                    sign.update();
                }
            }
        }

    }

}

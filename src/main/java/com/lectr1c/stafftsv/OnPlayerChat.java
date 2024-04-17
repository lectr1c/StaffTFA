package com.lectr1c.stafftsv;

import com.lectr1c.stafftsv.util.TextUtility;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class OnPlayerChat implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        var player = event.getPlayer();
        player.playSound(player, Sound.BLOCK_AMETHYST_CLUSTER_BREAK, 1, 1);

        event.setFormat(TextUtility.colorize("&#FF1177%s&r - &#7711FF" + event.getMessage()));
    }

    @EventHandler
    public void onPickup(EntityPickupItemEvent e) {
        e.setCancelled(true);
    }

}

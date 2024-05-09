package github.com.putt0.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerDropItemEvent;

@SuppressWarnings("all")
public class ServerListeners implements Listener {

    @EventHandler
    public void onBlockBreakEvent(BlockBreakEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void onBlockPlaceEvent(BlockPlaceEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void onPlayerDropItemEvent(PlayerDropItemEvent event) {
        event.setCancelled(true);
    }
}
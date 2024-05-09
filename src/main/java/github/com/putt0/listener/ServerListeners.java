package github.com.putt0.listener;

import github.com.putt0.item.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.Random;

public class ServerListeners implements Listener {

    private final String[] BEM_VINDO_DE_VOLTA = new String[]{
            "§bÉ muito bom ter você de volta!",
            "§cSenti sua falta :(",
            "§eVamos brincar?"
    };

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        event.setJoinMessage(null);

        Player player = event.getPlayer();

        player.getInventory().setItem(4, new ItemBuilder().newItem(Material.CHEST, "§aGadget's", new String[]
                {}, 1,(byte) 0));

        Bukkit.getOnlinePlayers().forEach(players -> {

            players.sendMessage("§8[§b+§8] §6" + player.getName() + " acaba de conectar!");
            players.playSound(players.getLocation(), Sound.ARROW_HIT, 100f, 100f);

            player.sendTitle("§6Olá " + player.getName(), player.hasPlayedBefore() ? BEM_VINDO_DE_VOLTA[new Random()
                    .nextInt(BEM_VINDO_DE_VOLTA.length)] : "§bSeja bem-vindo!");
        });
    }

    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent event) {
        event.setQuitMessage(null);

        Player player = event.getPlayer();

        Bukkit.getOnlinePlayers().forEach(players -> {

            players.sendMessage("§8[§c-§8] §6" + player.getName() + " acabou de sair!");
            players.playSound(players.getLocation(), Sound.ARROW_HIT, 100f, 100f);

        });
    }
}
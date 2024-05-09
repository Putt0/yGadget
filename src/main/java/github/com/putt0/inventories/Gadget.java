package github.com.putt0.inventories;

import github.com.putt0.manager.Gadgets;
import github.com.putt0.item.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Gadget {

    public static void inventoryGadgetMain(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 3 * 9, "§8Gadget's disponíveis.");

        int slot = 10;

        for (Gadgets gadgets : Gadgets.values()) {

            inventory.setItem(slot, new ItemBuilder().newHeadSkull("§a" + gadgets.getType(), player.getName(),
                    gadgets.getDescription()));

            slot++;
        }
        player.openInventory(inventory);
    }
}
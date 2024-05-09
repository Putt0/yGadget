package github.com.putt0.item;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

@SuppressWarnings("all") // Removendo avisos desnecessários!
public class ItemBuilder {

    public ItemStack newItem(Material material, String name, List<String> description, int quantity, byte bt) {
        ItemStack itemStack = new ItemStack(material, quantity, bt);

        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(name);
        itemMeta.setLore(description);

        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public ItemStack newHeadSkull(String name, String nickname, List<String> description) {
        ItemStack itemStack = new ItemStack(Material.getMaterial(397));
        SkullMeta skullMeta = (SkullMeta) itemStack.getItemMeta();

        itemStack.setDurability((short) 3);

        skullMeta.hasOwner();
        skullMeta.setOwner(nickname);
        skullMeta.setDisplayName(name);
        skullMeta.setLore(description);

        itemStack.setItemMeta(skullMeta);
        return itemStack;
    }
}
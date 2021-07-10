package tr.donsuzturk.gapplepvp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUI implements Listener
{
    public static void openGUI(final Player player) {
        final Inventory inv = Bukkit.createInventory(null, 9, "GApplePVP");
        final ItemStack gap = new ItemStack(Material.GOLDEN_APPLE);
        final ItemMeta gapMeta = gap.getItemMeta();
        assert gapMeta != null;
        gapMeta.setDisplayName(ChatColor.GOLD + "GOLDEN_APPLE");
        gap.setItemMeta(gapMeta);
        inv.setItem(0, gap);
        inv.setItem(1, gap);
        inv.setItem(2, gap);
        inv.setItem(3, gap);
        inv.setItem(4, gap);
        inv.setItem(5, gap);
        inv.setItem(6, gap);
        inv.setItem(7, gap);
        inv.setItem(8, gap);
        player.openInventory(inv);
    }
}

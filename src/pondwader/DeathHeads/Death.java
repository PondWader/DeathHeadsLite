package pondwader.DeathHeads;

import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.Arrays;

public class Death implements Listener {
    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        ItemStack skull = getPlayerSkull(event.getEntity());
        ItemMeta meta = skull.getItemMeta();
        meta.setLore(Arrays.asList("§7" + event.getDeathMessage()));
        skull.setItemMeta(meta);
        event.getDrops().add(skull);
    }

    private ItemStack getPlayerSkull(Player paramPlayer) {
        ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short) SkullType.PLAYER.ordinal());

        SkullMeta meta = (SkullMeta) skull.getItemMeta();
        meta.setOwner(paramPlayer.getName());
        meta.setDisplayName("§b" + paramPlayer.getName() + "'s Head");
        skull.setItemMeta(meta);

        return skull;
    }
}

package io.skillquest.mc.Util;

import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

/**
 * Helper class to assign click events to items for inventories.
 */
public abstract class Click {
  public ItemStack _item;

  public Click(ItemStack item) {
    this._item = item;
  }

  public abstract void run(InventoryClickEvent paramInventoryClickEvent);
}
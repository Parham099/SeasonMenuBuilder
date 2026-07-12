package ir.parham099.seasonMenuBuilder.menus

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.event.inventory.InventoryCloseEvent
import org.bukkit.event.inventory.InventoryOpenEvent

class MenuEventListener : Listener {
    @EventHandler
    fun onClick(event: InventoryClickEvent) {
        val player = event.whoClicked
        val uuid = player.uniqueId
        val menu = MenuManager.openedMenuPayers[uuid] ?: return

        val slot = event.slot
        if (!menu.items.containsKey(slot)) return
        val item = menu.items[slot]
        if (event.isRightClick) {
            menu.handleRightClick(event)
            item?.handleRightClick(event)
        } else if (event.isLeftClick) {
            menu.handleLeftClick(event)
            item?.handleLeftClick(event)
        } else if (event.isShiftClick) {
            menu.handleShiftClick(event)
            item?.handleShiftClick(event)
        }

        menu.handleClick(event)
        item?.handleClick(event)
    }

    @EventHandler
    fun onOpenMenu(event: InventoryOpenEvent) {
        val player = event.player
        val uuid = player.uniqueId
        val menu = MenuManager.openedMenuPayers[uuid] ?: return

        menu.handleOpen(event)
    }

    @EventHandler
    fun onCloseMenu(event: InventoryCloseEvent) {
        val player = event.player
        val uuid = player.uniqueId
        val menu = MenuManager.openedMenuPayers[uuid] ?: return

        menu.handleClose(event)
        MenuManager.openedMenuPayers.remove(uuid)
    }
}
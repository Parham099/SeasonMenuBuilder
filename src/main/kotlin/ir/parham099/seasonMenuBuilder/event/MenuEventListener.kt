package ir.parham099.seasonMenuBuilder.event

import ir.parham099.seasonMenuBuilder.builder.DynamicMenuBuilder
import ir.parham099.seasonMenuBuilder.runtime.MenuManager
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
        val item = menu.items[slot] ?: return
        if (item.itemStack != event.currentItem) return

        try {
            if (event.isRightClick) {
                menu.handleRightClick(event)
                item.handleRightClick(event)
            } else if (event.isLeftClick) {
                menu.handleLeftClick(event)
                item.handleLeftClick(event)
            } else if (event.isShiftClick) {
                menu.handleShiftClick(event)
                item.handleShiftClick(event)
            }

            menu.handleClick(event)
            item.handleClick(event)
        } catch (_: Exception) {}
        (menu as? DynamicMenuBuilder)?.doRefreshRequest()
    }

    @EventHandler
    fun onOpenMenu(event: InventoryOpenEvent) {
        val player = event.player
        val uuid = player.uniqueId
        val menu = MenuManager.openedMenuPayers[uuid] ?: return

        try {
            menu.handleOpen(event)
        } catch (_: Exception) {}
        (menu as? DynamicMenuBuilder)?.doRefreshRequest()
    }

    @EventHandler
    fun onCloseMenu(event: InventoryCloseEvent) {
        val player = event.player
        val uuid = player.uniqueId
        val menu = MenuManager.openedMenuPayers[uuid] ?: return

        try {
            menu.handleClose(event)
        } catch (_: Exception) {}
        (menu as? DynamicMenuBuilder)?.doRefreshRequest()

        MenuManager.openedMenuPayers.remove(uuid)
        if (!MenuManager.onUpdatePlayers.contains(uuid)) {
            MenuManager.openedPaginated.remove(uuid)
        } else {
            MenuManager.onUpdatePlayers.remove(uuid)
        }
    }
}
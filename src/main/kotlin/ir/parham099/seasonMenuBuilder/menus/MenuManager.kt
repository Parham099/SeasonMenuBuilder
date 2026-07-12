package ir.parham099.seasonMenuBuilder.menus

import org.bukkit.entity.Player
import java.util.UUID

object MenuManager {
    val openedMenuPayers = hashMapOf<UUID, MenuBuilder>()

    fun Player.openGui(menuBuilder: MenuBuilder) {
        try {
            val menu = menuBuilder.copy()
            menu.player = this.uniqueId

            when (menu.menuType) {
                MenuType.STATIC -> {
                    this.openInventory(menu.inventory!!)
                }

                MenuType.DYNAMIC -> {
                    this.openInventory(menu.buildAsBukkitInventory())
                }
            }
            openedMenuPayers[menu.player!!] = menu
        } catch (exc: Exception) {
            this.closeInventory()
            if (openedMenuPayers.contains(this.uniqueId)) openedMenuPayers.remove(this.uniqueId)
        }
    }
}
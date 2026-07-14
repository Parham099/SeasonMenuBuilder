package ir.parham099.seasonMenuBuilder.menus

import org.bukkit.entity.HumanEntity
import java.util.UUID

object MenuManager {
    val openedMenuPayers = hashMapOf<UUID, MenuBuilder>()

    fun HumanEntity.openGui(menuBuilder: MenuBuilder) {
        try {
            val menu = menuBuilder.copy()
            menu.player = this.uniqueId
            this.closeInventory()
            // add player to openedMenu map
            openedMenuPayers[menu.player!!] = menu
            when (menu.menuType) {
                MenuType.STATIC -> {
                    this.openInventory(menu.inventory!!)
                }

                MenuType.DYNAMIC -> {
                    this.openInventory(menu.build())
                }
            }
        } catch (exc: Exception) {
            this.closeInventory()
            if (openedMenuPayers.contains(this.uniqueId)) openedMenuPayers.remove(this.uniqueId)
            exc.printStackTrace()
        }
    }
}
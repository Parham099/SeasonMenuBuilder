package ir.parham099.seasonMenuBuilder.runtime

import ir.parham099.seasonMenuBuilder.builder.BaseMenuBuilder
import ir.parham099.seasonMenuBuilder.builder.StaticMenuBuilder
import ir.parham099.seasonMenuBuilder.menus.MenuType
import org.bukkit.entity.HumanEntity
import java.util.UUID

object MenuManager {
    val openedMenuPayers = hashMapOf<UUID, BaseMenuBuilder>()

    fun HumanEntity.openGui(baseMenuBuilder: BaseMenuBuilder) {
        try {
            val menu = baseMenuBuilder.copy()
            menu.player = this.uniqueId
            this.closeInventory()
            // add player to openedMenu map
            openedMenuPayers[menu.player!!] = menu
            // open inventory
            menu.open()
        } catch (exc: Exception) {
            this.closeInventory()
            if (openedMenuPayers.contains(this.uniqueId)) openedMenuPayers.remove(this.uniqueId)
            exc.printStackTrace()
        }
    }
}
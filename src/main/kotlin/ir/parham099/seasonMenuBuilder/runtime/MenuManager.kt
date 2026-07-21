package ir.parham099.seasonMenuBuilder.runtime

import ir.parham099.seasonMenuBuilder.builder.BaseMenuBuilder
import ir.parham099.seasonMenuBuilder.builder.StaticMenuBuilder
import ir.parham099.seasonMenuBuilder.builder.template.paginated.PaginatedData
import ir.parham099.seasonMenuBuilder.builder.template.paginated.PaginatedMenuBuilder
import ir.parham099.seasonMenuBuilder.menus.MenuType
import org.bukkit.entity.HumanEntity
import java.util.UUID

object MenuManager {
    // save opened players
    val openedMenuPayers = hashMapOf<UUID, BaseMenuBuilder>()

    // save opened paginated gui
    val openedPaginated = hashMapOf<UUID, PaginatedData>()

    // add: 0.0.8-Beta to know close type is update or really close! for better performance.
    val onUpdatePlayers = hashSetOf<UUID>()

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
            if (onUpdatePlayers.contains(this.uniqueId)) onUpdatePlayers.remove(this.uniqueId)
            this.closeInventory()
            if (openedMenuPayers.contains(this.uniqueId)) openedMenuPayers.remove(this.uniqueId)
            exc.printStackTrace()
        }
    }

    fun HumanEntity.openGui(paginatedMenuBuilder: PaginatedMenuBuilder) {
        try {
            val menu = paginatedMenuBuilder.copy()
            this.closeInventory()
            openedPaginated[this.uniqueId] = PaginatedData(
                paginatedMenuBuilder = menu
            )
            // open inventory
            menu.open(this)
        } catch (exc: Exception) {
            if (onUpdatePlayers.contains(this.uniqueId)) onUpdatePlayers.remove(this.uniqueId)
            this.closeInventory()
            if (openedPaginated.contains(this.uniqueId)) openedPaginated.remove(this.uniqueId)
            exc.printStackTrace()
        }
    }
}
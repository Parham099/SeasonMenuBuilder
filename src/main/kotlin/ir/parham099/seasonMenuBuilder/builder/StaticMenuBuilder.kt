package ir.parham099.seasonMenuBuilder.builder

import ir.parham099.seasonMenuBuilder.dsl.MenuDsl
import ir.parham099.seasonMenuBuilder.menus.MenuType
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.Bukkit
import org.bukkit.inventory.Inventory
import java.util.UUID

@MenuDsl
class StaticMenuBuilder(
    title: Component = MiniMessage.miniMessage().deserialize(""),
    size: Int = 27,
    player: UUID? = null,
    var block: StaticMenuBuilder.() -> Unit = {},
    initialize: Boolean = true
) : BaseMenuBuilder(
    title = title,
    size = size,
    menuType = MenuType.STATIC,
    player = player
) {
    override var inventory: Inventory? = null

    init {
        if (initialize) {
            block(this)
            fixItemsMap()
            inventory = buildInventory()
        }
    }

    override fun copy(): BaseMenuBuilder {
        return StaticMenuBuilder(
            title = title,
            size = size,
            player = player,
            initialize = false
        ).apply {
            for (entry in this@StaticMenuBuilder.items) {
                items[entry.key] = entry.value
            }
            inventory = this@StaticMenuBuilder.inventory
            // copy from events
            handleClick = this@StaticMenuBuilder.handleClick
            handleLeftClick = this@StaticMenuBuilder.handleLeftClick
            handleRightClick = this@StaticMenuBuilder.handleRightClick
            handleShiftClick = this@StaticMenuBuilder.handleShiftClick
            handleOpen = this@StaticMenuBuilder.handleOpen
            handleClose = this@StaticMenuBuilder.handleClose
        }
    }

    override fun open() {
        val uuid = player ?: return
        Bukkit.getPlayer(uuid)?.openInventory(inventory!!)
    }
}
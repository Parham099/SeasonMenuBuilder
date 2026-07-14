package ir.parham099.seasonMenuBuilder.builder

import ir.parham099.seasonMenuBuilder.dsl.MenuDsl
import ir.parham099.seasonMenuBuilder.runtime.MenuManager.openGui
import ir.parham099.seasonMenuBuilder.menus.MenuType
import ir.parham099.seasonMenuBuilder.item.MenuItem
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.event.inventory.InventoryCloseEvent
import org.bukkit.event.inventory.InventoryOpenEvent
import org.bukkit.inventory.Inventory
import java.util.UUID

@MenuDsl
class StaticMenuBuilder(
    title: Component = MiniMessage.miniMessage().deserialize(""),
    size: Int = 27,
    player: UUID? = null,
    block: BaseMenuBuilder.() -> Unit = {},
) : BaseMenuBuilder(
    title = title,
    size = size,
    menuType = MenuType.STATIC,
    player = player,
    block = block
) {
    init {
        inventory = buildInventory()
    }

    override fun copy(): BaseMenuBuilder {
        return StaticMenuBuilder(
            title = title,
            size = size,
            player = player,
            block = block
        )
    }

    override fun open() {
        val uuid = player ?: return
        Bukkit.getPlayer(uuid)?.openInventory(inventory!!)
    }
}
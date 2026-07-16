package ir.parham099.seasonMenuBuilder.builder

import ir.parham099.seasonMenuBuilder.dsl.MenuDsl
import ir.parham099.seasonMenuBuilder.menus.MenuType
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.Bukkit
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
    player = player,
) {
    init {
        if (initialize) {
            block(this)
            inventory = buildInventory()
        }
    }

    override fun copy(): BaseMenuBuilder {
        return StaticMenuBuilder(
            title = title,
            size = size,
            player = player,
            block = block,
            initialize = false
        )
    }

    override fun open() {
        val uuid = player ?: return
        Bukkit.getPlayer(uuid)?.openInventory(inventory!!)
    }
}
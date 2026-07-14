package ir.parham099.seasonMenuBuilder.builder

import ir.parham099.seasonMenuBuilder.menus.MenuType
import ir.parham099.seasonMenuBuilder.runtime.MenuManager.openGui
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.Bukkit
import org.bukkit.inventory.Inventory
import java.util.UUID

class DynamicMenuBuilder(
    title: Component = MiniMessage.miniMessage().deserialize(""),
    size: Int = 27,
    player: UUID? = null,
    val states: HashMap<String, Any?> = hashMapOf(),
    block: BaseMenuBuilder.() -> Unit = {},
) : BaseMenuBuilder(
    title = title,
    size = size,
    menuType = MenuType.DYNAMIC,
    player = player,
    block = block
) {
    fun refresh() {
        val uuid = player ?: return
        val human = Bukkit.getPlayer(uuid) ?: return
        human.openGui(this)
    }

    fun build(): Inventory {
        inventory = buildInventory()
        return inventory!!
    }

    override fun copy(): DynamicMenuBuilder {
        return DynamicMenuBuilder(
            title = title,
            size = size,
            player = player,
            states = states,
            block = block
        )
    }

    override fun open() {
        val uuid = player ?: return
        Bukkit.getPlayer(uuid)?.openInventory(build())
    }
}
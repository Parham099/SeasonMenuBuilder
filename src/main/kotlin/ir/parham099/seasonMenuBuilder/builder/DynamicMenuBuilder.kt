package ir.parham099.seasonMenuBuilder.builder

import ir.parham099.seasonMenuBuilder.dsl.MenuDsl
import ir.parham099.seasonMenuBuilder.menus.MenuType
import ir.parham099.seasonMenuBuilder.runtime.MenuManager
import ir.parham099.seasonMenuBuilder.runtime.MenuManager.openGui
import ir.parham099.seasonMenuBuilder.state.UseState
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.Bukkit
import org.bukkit.inventory.Inventory
import java.util.UUID

@MenuDsl
class DynamicMenuBuilder(
    title: Component = MiniMessage.miniMessage().deserialize(""),
    size: Int = 27,
    player: UUID? = null,
    val states: HashMap<String, Any?> = hashMapOf(),
    var block: DynamicMenuBuilder.() -> Unit = {},
) : BaseMenuBuilder(
    title = title,
    size = size,
    menuType = MenuType.DYNAMIC,
    player = player,
) {
    override val inventory: Inventory
        get() = buildInventory()

    init {
        block(this)
        fixItemsMap()
    }

    fun append(new: DynamicMenuBuilder.() -> Unit) {
        new(this)
    }

    fun refresh() {
        items.clear()
        block(this)
        fixItemsMap()
        val uuid = player ?: return
        val human = Bukkit.getPlayer(uuid) ?: return
        // add to onUpdate processor to dont remove from map
        MenuManager.onUpdatePlayers.add(uuid)
        human.openGui(this)
    }

    fun <T> useState(initial: T): UseState<T> {
        return UseState(this, initial)
    }

    override fun copy(): DynamicMenuBuilder {
        return DynamicMenuBuilder(
            title = title,
            size = size,
            player = player,
            states = HashMap(states),
            block = block
        )
    }

    override fun open() {
        val uuid = player ?: return
        Bukkit.getPlayer(uuid)?.openInventory(inventory)
    }
}
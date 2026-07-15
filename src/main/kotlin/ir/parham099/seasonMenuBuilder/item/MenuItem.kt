package ir.parham099.seasonMenuBuilder.item

import ir.parham099.seasonMenuBuilder.builder.BaseMenuBuilder
import ir.parham099.seasonMenuBuilder.dsl.MenuDsl
import net.kyori.adventure.text.Component
import org.bukkit.Material
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.inventory.ItemFlag
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.ItemMeta

@MenuDsl
data class MenuItem(
    val material: Material,
    var slot: Int,
    var menu: BaseMenuBuilder? = null
) {
    var id: Int = -1
    var amount: Int = 1
        set(value) {
            field = value
            itemStack.amount = value
        }
    val itemStack: ItemStack = ItemStack(material, amount)
    var meta: ItemMeta
        get() = itemStack.itemMeta
        set(value) {
            itemStack.itemMeta = value
        }

    var displayName: Component?
        set(value) {
            val itemMeta = meta
            itemMeta.displayName(value)
            meta = itemMeta
        }
        get() = meta.displayName()

    var lore: List<Component>?
        set(value) {
            val itemMeta = meta
            itemMeta.lore(value)
            meta = itemMeta
        }
        get() = meta.lore()

    var flags: Set<ItemFlag>
        set(value) {
            val itemMeta = meta
            itemMeta.itemFlags.clear()
            value.forEach {
                itemMeta.addItemFlags(it)
            }
            meta = itemMeta
        }
        get() = meta.itemFlags

    var handleClick: (InventoryClickEvent) -> Unit = {}
        private set

    fun onClick(block: (InventoryClickEvent) -> Unit) {
        handleClick = block
    }

    var handleRightClick: (InventoryClickEvent) -> Unit = {}
        private set

    fun onRightClick(block: (InventoryClickEvent) -> Unit) {
        handleRightClick = block
    }

    var handleLeftClick: (InventoryClickEvent) -> Unit = {}
        private set

    fun onLeftClick(block: (InventoryClickEvent) -> Unit) {
        handleLeftClick = block
    }

    var handleShiftClick: (InventoryClickEvent) -> Unit = {}
        private set

    fun onShiftClick(block: (InventoryClickEvent) -> Unit) {
        handleShiftClick = block
    }
}
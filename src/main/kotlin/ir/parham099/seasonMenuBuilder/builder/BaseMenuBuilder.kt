package ir.parham099.seasonMenuBuilder.builder

import ir.parham099.seasonMenuBuilder.dsl.MenuDsl
import ir.parham099.seasonMenuBuilder.item.MenuItem
import ir.parham099.seasonMenuBuilder.menus.MenuType
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
abstract class BaseMenuBuilder(
    var title: Component = MiniMessage.miniMessage().deserialize(""),
    var size: Int = 27,
    val menuType: MenuType = MenuType.STATIC,
    var player: UUID? = null,
) {
    var inventory: Inventory? = null
        protected set
    val items = hashMapOf<Int, MenuItem?>()

    abstract fun copy(): BaseMenuBuilder
    abstract fun open()

    fun item(
        material: Material,
        slots: List<Int>,
        block: MenuItem.() -> Unit = {}
    ) {
        for (slot in slots) {
            val menuItem = MenuItem(slot = slot, material = material, menu = this).apply(block)
            items[slot] = menuItem
            inventory?.setItem(slot, menuItem.itemStack)
        }
    }

    // events

    var handleClose: (InventoryCloseEvent) -> Unit = {}
        private set

    fun onClose(handler: (InventoryCloseEvent) -> Unit) {
        handleClose = handler
    }

    var handleOpen: (InventoryOpenEvent) -> Unit = {}
        private set

    fun onOpen(handler: (InventoryOpenEvent) -> Unit) {
        handleOpen = handler
    }

    var handleClick: (InventoryClickEvent) -> Unit = {}
        private set

    fun onClick(handler: (InventoryClickEvent) -> Unit) {
        handleClick = handler
    }

    var handleRightClick: (InventoryClickEvent) -> Unit = {}
        private set

    fun onRightClick(handler: (InventoryClickEvent) -> Unit) {
        handleRightClick = handler
    }

    var handleLeftClick: (InventoryClickEvent) -> Unit = {}
        private set

    fun onLeftClick(handler: (InventoryClickEvent) -> Unit) {
        handleLeftClick = handler
    }

    var handleShiftClick: (InventoryClickEvent) -> Unit = {}
        private set

    fun onShiftClick(handler: (InventoryClickEvent) -> Unit) {
        handleShiftClick = handler
    }

    protected fun fixItemsMap() {
        for (i in 0 until size) {
            items.putIfAbsent(i, null)
        }
    }

    protected fun buildInventory(): Inventory {
        val inventory = Bukkit.createInventory(null, size, title)
        for (slot in 0 until size) {
            val item = items[slot] ?: continue
            inventory.setItem(slot, item.itemStack)
        }

        return inventory
    }
}
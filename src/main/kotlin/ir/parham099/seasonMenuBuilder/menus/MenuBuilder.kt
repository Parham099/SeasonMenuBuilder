package ir.parham099.seasonMenuBuilder.menus

import ir.parham099.seasonMenuBuilder.MenuDsl
import ir.parham099.seasonMenuBuilder.menus.MenuManager.openGui
import ir.parham099.seasonMenuBuilder.models.Item
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
data class MenuBuilder(
    val title: Component = MiniMessage.miniMessage().deserialize(""),
    val size: Int = 27,
    val menuType: MenuType = MenuType.STATIC,
    var player: UUID? = null,
    var block: MenuBuilder.() -> Unit = {},
) {
    var inventory: Inventory? = null
        private set
    val items = hashMapOf<Int, Item?>()

    init {
        block(this)
        fixItemsMap()
        if (menuType == MenuType.STATIC) {
            inventory = buildInventory()
        }
    }

    fun item(
        material: Material,
        slots: List<Int>,
        block: Item.() -> Unit = {}
    ) {
        for (slot in slots) {
            val item = Item(slot = slot, material = material, menu = this).apply(block)
            items[slot] = item
            inventory?.setItem(slot, item.itemStack)
        }
    }

    // just for dynamic menu
    fun refresh() {
        val uuid = player ?: return
        val human = Bukkit.getPlayer(uuid) ?: return
        human.openGui(this)
    }

    fun build(): Inventory {
        inventory = buildInventory()
        return inventory!!
    }

    // events

    var handleClose: (InventoryCloseEvent) -> Unit = {}
        private set

    fun onClose(block: (InventoryCloseEvent) -> Unit) {
        handleClose = block
    }

    var handleOpen: (InventoryOpenEvent) -> Unit = {}
        private set

    fun onOpen(block: (InventoryOpenEvent) -> Unit) {
        handleOpen = block
    }

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

    private fun fixItemsMap() {
        for (i in 0 until size) {
            items.putIfAbsent(i, null)
        }
    }

    private fun buildInventory(): Inventory {
        val inventory = Bukkit.createInventory(null, size, title)
        for (slot in 0 until size) {
            val item = items[slot] ?: continue
            inventory.setItem(slot, item.itemStack)
        }

        return inventory
    }
}
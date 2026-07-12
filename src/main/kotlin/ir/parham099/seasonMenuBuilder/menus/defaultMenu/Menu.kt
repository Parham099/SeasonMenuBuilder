package ir.parham099.seasonMenuBuilder.menus.defaultMenu

import ir.parham099.seasonMenuBuilder.menus.MenuBuilder
import ir.parham099.seasonMenuBuilder.menus.MenuType
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.minimessage.MiniMessage

fun menu(
    title: Component,
    size: Int,
    menuType: MenuType = MenuType.DYNAMIC,
    block: MenuBuilder.() -> Unit
): MenuBuilder {
    return MenuBuilder(
        title = title,
        size = size,
        menuType = menuType,
        block = block
    ).apply(block)
}

fun menu(
    title: String,
    size: Int,
    menuType: MenuType = MenuType.DYNAMIC,
    block: MenuBuilder.() -> Unit
): MenuBuilder {
    return menu(
        title = MiniMessage.miniMessage().deserialize(title),
        size = size,
        menuType = menuType,
        block = block
    ).apply(block)
}
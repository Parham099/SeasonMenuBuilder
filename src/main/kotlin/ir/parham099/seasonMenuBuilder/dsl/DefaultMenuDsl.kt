package ir.parham099.seasonMenuBuilder.dsl

import ir.parham099.seasonMenuBuilder.builder.BaseMenuBuilder
import ir.parham099.seasonMenuBuilder.builder.DynamicMenuBuilder
import ir.parham099.seasonMenuBuilder.builder.StaticMenuBuilder
import ir.parham099.seasonMenuBuilder.menus.MenuType
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.minimessage.MiniMessage

fun menu(
    title: Component,
    size: Int,
    menuType: MenuType = MenuType.DYNAMIC,
    block: BaseMenuBuilder.() -> Unit = {}
): BaseMenuBuilder {
    return when (menuType) {
        MenuType.STATIC -> StaticMenuBuilder(
            title = title,
            size = size,
            player = null,
            block = block
        ).apply(block)

        MenuType.DYNAMIC -> DynamicMenuBuilder(
            title = title,
            size = size,
            player = null,
            block = block
        ).apply(block)
    }
}

fun menu(
    title: String,
    size: Int,
    menuType: MenuType = MenuType.DYNAMIC,
    block: BaseMenuBuilder.() -> Unit = {}
): BaseMenuBuilder {
    return menu(
        title = MiniMessage.miniMessage().deserialize(title),
        size = size,
        menuType = menuType,
        block = block
    ).apply(block)
}


fun menu9(
    title: Component,
    menuType: MenuType = MenuType.DYNAMIC,
    block: BaseMenuBuilder.() -> Unit = {}
): BaseMenuBuilder {
    return menu(
        title = title,
        size = 9,
        menuType = menuType,
        block = block
    )
}

fun menu9(
    title: String,
    menuType: MenuType = MenuType.DYNAMIC,
    block: BaseMenuBuilder.() -> Unit = {}
): BaseMenuBuilder {
    return menu(
        title = title,
        size = 9,
        menuType = menuType,
        block = block
    )
}

fun menu18(
    title: Component,
    menuType: MenuType = MenuType.DYNAMIC,
    block: BaseMenuBuilder.() -> Unit = {}
): BaseMenuBuilder {
    return menu(
        title = title,
        size = 18,
        menuType = menuType,
        block = block
    )
}

fun menu18(
    title: String,
    menuType: MenuType = MenuType.DYNAMIC,
    block: BaseMenuBuilder.() -> Unit = {}
): BaseMenuBuilder {
    return menu(
        title = title,
        size = 18,
        menuType = menuType,
        block = block
    )
}

fun menu27(
    title: Component,
    menuType: MenuType = MenuType.DYNAMIC,
    block: BaseMenuBuilder.() -> Unit = {}
): BaseMenuBuilder {
    return menu(
        title = title,
        size = 27,
        menuType = menuType,
        block = block
    )
}

fun menu27(
    title: String,
    menuType: MenuType = MenuType.DYNAMIC,
    block: BaseMenuBuilder.() -> Unit = {}
): BaseMenuBuilder {
    return menu(
        title = title,
        size = 27,
        menuType = menuType,
        block = block
    )
}

fun menu36(
    title: Component,
    menuType: MenuType = MenuType.DYNAMIC,
    block: BaseMenuBuilder.() -> Unit = {}
): BaseMenuBuilder {
    return menu(
        title = title,
        size = 36,
        menuType = menuType,
        block = block
    )
}

fun menu36(
    title: String,
    menuType: MenuType = MenuType.DYNAMIC,
    block: BaseMenuBuilder.() -> Unit = {}
): BaseMenuBuilder {
    return menu(
        title = title,
        size = 36,
        menuType = menuType,
        block = block
    )
}

fun menu45(
    title: Component,
    menuType: MenuType = MenuType.DYNAMIC,
    block: BaseMenuBuilder.() -> Unit = {}
): BaseMenuBuilder {
    return menu(
        title = title,
        size = 45,
        menuType = menuType,
        block = block
    )
}

fun menu45(
    title: String,
    menuType: MenuType = MenuType.DYNAMIC,
    block: BaseMenuBuilder.() -> Unit = {}
): BaseMenuBuilder {
    return menu(
        title = title,
        size = 45,
        menuType = menuType,
        block = block
    )
}

fun menu54(
    title: Component,
    menuType: MenuType = MenuType.DYNAMIC,
    block: BaseMenuBuilder.() -> Unit = {}
): BaseMenuBuilder {
    return menu(
        title = title,
        size = 54,
        menuType = menuType,
        block = block
    )
}

fun menu54(
    title: String,
    menuType: MenuType = MenuType.DYNAMIC,
    block: BaseMenuBuilder.() -> Unit = {}
): BaseMenuBuilder {
    return menu(
        title = title,
        size = 54,
        menuType = menuType,
        block = block
    )
}
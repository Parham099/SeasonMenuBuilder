package ir.parham099.seasonMenuBuilder.dsl

import ir.parham099.seasonMenuBuilder.builder.DynamicMenuBuilder
import ir.parham099.seasonMenuBuilder.builder.StaticMenuBuilder
import ir.parham099.seasonMenuBuilder.builder.template.paginated.PaginatedMenuBuilder
import net.kyori.adventure.text.Component

fun paginatedMenu(
    block: PaginatedMenuBuilder.() -> Unit = {}
): PaginatedMenuBuilder {
    return PaginatedMenuBuilder(block = block)
}

fun PaginatedMenuBuilder.dynamicPage(
    size: Int,
    title: Component = Component.text(size),
    block: DynamicMenuBuilder.() -> Unit = {}
): DynamicMenuBuilder {
    val menu = dynamicMenu(
        size = size,
        title = title,
        block = block
    )

    this.createPage(menu)
    return menu
}

fun PaginatedMenuBuilder.staticPage(
    size: Int,
    title: Component = Component.text(size),
    block: StaticMenuBuilder.() -> Unit = {}
): StaticMenuBuilder {
    val menu = staticMenu(
        size = size,
        title = title,
        block = block
    )

    this.createPage(menu)
    return menu
}
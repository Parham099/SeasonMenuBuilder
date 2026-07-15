package ir.parham099.seasonMenuBuilder.dsl

import ir.parham099.seasonMenuBuilder.builder.DynamicMenuBuilder
import net.kyori.adventure.text.Component

fun dynamicMenu(
    title: Component,
    size: Int,
    block: DynamicMenuBuilder.() -> Unit
): DynamicMenuBuilder {
    return DynamicMenuBuilder(
        title = title,
        size = size,
        block = block
    )
}

fun dynamicMenu(
    title: String,
    size: Int,
    block: DynamicMenuBuilder.() -> Unit
): DynamicMenuBuilder {
    return dynamicMenu(
        title = Component.text(title),
        size = size,
        block = block
    )
}
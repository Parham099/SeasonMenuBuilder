package ir.parham099.seasonMenuBuilder.dsl

import ir.parham099.seasonMenuBuilder.builder.StaticMenuBuilder
import net.kyori.adventure.text.Component

fun staticMenu(
    title: Component,
    size: Int,
    block: StaticMenuBuilder.() -> Unit
): StaticMenuBuilder {
    return StaticMenuBuilder(
        title = title,
        size = size,
        block = block
    )
}

fun staticMenu(
    title: String,
    size: Int,
    block: StaticMenuBuilder.() -> Unit
): StaticMenuBuilder {
    return staticMenu(
        title = Component.text(title),
        size = size,
        block = block
    )
}
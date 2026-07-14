package ir.parham099.seasonMenuBuilder.menus.operators

import ir.parham099.seasonMenuBuilder.menus.MenuBuilder
import kotlin.reflect.KProperty

class UseState<T>(
    private val menu: MenuBuilder,
    initial: T
) {
    private var state = initial

    operator fun getValue(thisRef: Any?, property: KProperty<*>): T = state

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        if (state == value) return   // اگر تغییری نکرده refresh نکن
        state = value
        menu.refresh()
    }
}

fun <T> useState(menu: MenuBuilder, initial: T): UseState<T> {
    return UseState(menu, initial)
}
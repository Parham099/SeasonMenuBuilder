package ir.parham099.seasonMenuBuilder.state

import ir.parham099.seasonMenuBuilder.builder.DynamicMenuBuilder
import kotlin.reflect.KProperty

class UseState<T>(
    private val menu: DynamicMenuBuilder,
    val initial: T
) {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
        val name = property.name
        if (!menu.states.containsKey(name)) {
            menu.states[name] = initial
        }

        return menu.states[name] as T
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        val name = property.name
        if (menu.states[name] == value) return   // اگر تغییری نکرده refresh نکن
        menu.states[name] = value
        menu.refreshRequest()
    }
}
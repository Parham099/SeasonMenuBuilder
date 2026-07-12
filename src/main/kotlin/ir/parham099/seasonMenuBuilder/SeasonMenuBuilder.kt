package ir.parham099.seasonMenuBuilder

import ir.parham099.seasonMenuBuilder.menus.MenuEventListener
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class SeasonMenuBuilder(instance: JavaPlugin) {
    init {
        Bukkit.getPluginManager().registerEvents(MenuEventListener(), instance)
    }
}
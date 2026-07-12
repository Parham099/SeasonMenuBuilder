package generator

import org.bukkit.Material
import java.io.File

fun main() {
    val file = File(
        "src/main/kotlin/ir/parham099/seasonMenuBuilder/models/Materials.kt"
    )
    file.parentFile.mkdirs()

    file.writeText(buildString {
        appendLine("package ir.parham099.seasonMenuBuilder.models")
        appendLine()
        appendLine("import org.bukkit.Material")
        appendLine("import ir.parham099.seasonMenuBuilder.menus.MenuBuilder")
        appendLine("import ir.parham099.seasonMenuBuilder.models.Item")
        appendLine()

        Material.entries.forEach { material ->
            val name = material.name.toCamelCase()

            appendLine(
                """
fun MenuBuilder.$name(
    vararg slots: Int,
    block: Item.() -> Unit = {}
) = item(Material.${material.name}, slots.toList(), block)
            """.trimIndent()
            )

            appendLine()
        }
    })
}

fun String.toCamelCase(): String =
    lowercase()
        .split("_")
        .mapIndexed { index, part ->
            if (index == 0) part
            else part.replaceFirstChar(Char::uppercase)
        }
        .joinToString("")
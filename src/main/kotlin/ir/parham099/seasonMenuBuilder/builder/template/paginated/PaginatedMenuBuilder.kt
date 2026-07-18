package ir.parham099.seasonMenuBuilder.builder.template.paginated

import ir.parham099.seasonMenuBuilder.builder.BaseMenuBuilder
import ir.parham099.seasonMenuBuilder.runtime.MenuManager.openGui
import org.bukkit.Bukkit
import java.util.UUID

data class PaginatedMenuBuilder(
    var player: UUID? = null,
    var nowPage: Int = 0,
    private val pages: MutableList<BaseMenuBuilder> = mutableListOf<BaseMenuBuilder>(),
    var block: PaginatedMenuBuilder.() -> Unit
) {

    val size: Int
        get() = pages.size

    init {
        block(this)
    }

    fun reload() {
        block(this)
    }

    fun next() {
        val uuid = player ?: return
        val nextPageIndex = nowPage + 1
        if (pages.size < nextPageIndex) {
            Bukkit.getPlayer(uuid)?.openGui(
                pages[nextPageIndex]
            )
        }
    }

    fun previous() {
        val uuid = player ?: return
        val nextPageIndex = nowPage - 1
        if (nextPageIndex >= 0) {
            Bukkit.getPlayer(uuid)?.openGui(
                pages[nextPageIndex]
            )
        }
    }

    fun openPageByIndex(index: Int) {
        val uuid = player ?: return
        if (pages.size > index) {
            Bukkit.getPlayer(uuid)?.openGui(
                pages[index]
            )
        }
    }

    fun openPage(page: Int) {
        val uuid = player ?: return
        if (pages.size >= page) {
            Bukkit.getPlayer(uuid)?.openGui(
                pages[page - 1]
            )
        }
    }

    fun hasNextPage(): Boolean {
        val nextPageIndex = nowPage + 1
        return pages.size < nextPageIndex
    }

    fun hasPreviousPage(): Boolean {
        val nextPageIndex = nowPage - 1
        return nextPageIndex >= 0
    }

    private fun createPage(menu: BaseMenuBuilder) {
        pages.add(menu)
    }

    fun setPage(pageIndex: Int, menu: BaseMenuBuilder) {
        pages[pageIndex] = menu
    }

    fun deletePage(pageIndex: Int) {
        pages.removeAt(pageIndex)
    }
}
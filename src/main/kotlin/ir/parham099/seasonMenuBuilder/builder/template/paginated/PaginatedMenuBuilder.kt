package ir.parham099.seasonMenuBuilder.builder.template.paginated

import ir.parham099.seasonMenuBuilder.builder.BaseMenuBuilder
import ir.parham099.seasonMenuBuilder.runtime.MenuManager
import ir.parham099.seasonMenuBuilder.runtime.MenuManager.openGui
import ir.parham099.seasonMenuBuilder.runtime.MenuManager.openedPaginated
import org.bukkit.Bukkit
import org.bukkit.entity.HumanEntity
import java.util.UUID
import kotlin.collections.set

data class PaginatedMenuBuilder(
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

    fun open(player: HumanEntity) {
        openPageByIndex(player, 0)
    }

    fun next(player: HumanEntity) {
        val nowPage = MenuManager.openedPaginated[player.uniqueId]?.apply {
            nowPage++
        }?.nowPage ?: return
        openPageByIndex(player, nowPage)
    }

    fun previous(player: HumanEntity) {
        val nowPage = MenuManager.openedPaginated[player.uniqueId]?.apply {
            nowPage--
        }?.nowPage ?: return
        openPageByIndex(player, nowPage)
    }

    fun openPageByIndex(player: HumanEntity, index: Int) {
        if (pages.size > index) {
            val nowPage = MenuManager.openedPaginated[player.uniqueId]?.apply {
                nowPage = index
            }?.nowPage ?: return
            player.openGui(
                pages[nowPage]
            )
            openedPaginated[player.uniqueId] = PaginatedData(
                nowPage = nowPage,
                paginatedMenuBuilder = this
            )
        }
    }

    fun hasNextPage(player: HumanEntity): Boolean {
        val nextPageIndex = MenuManager.openedPaginated[player.uniqueId]?.nowPage?.plus(1) ?: return false
        return pages.size - 1 > nextPageIndex
    }

    fun hasPreviousPage(player: HumanEntity): Boolean {
        val nextPageIndex = MenuManager.openedPaginated[player.uniqueId]?.nowPage?.minus(1) ?: return false
        return nextPageIndex >= 0
    }

    fun createPage(menu: BaseMenuBuilder) {
        pages.add(menu)
    }

    fun setPage(pageIndex: Int, menu: BaseMenuBuilder) {
        pages[pageIndex] = menu
    }

    fun deletePage(pageIndex: Int) {
        pages.removeAt(pageIndex)
    }
}
package ir.parham099.seasonMenuBuilder.builder.template.paginated

data class PaginatedData(
    val paginatedMenuBuilder: PaginatedMenuBuilder,
    var nowPage: Int = 0
)
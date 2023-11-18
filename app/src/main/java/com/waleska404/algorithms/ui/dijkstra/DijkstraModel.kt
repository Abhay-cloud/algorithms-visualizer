package com.waleska404.algorithms.ui.dijkstra

import com.waleska404.algorithms.domain.dijkstra.Position
import com.waleska404.algorithms.ui.core.components.CellType

data class DijkstraGrid(
    val grid: List<List<CellData>>
) {
    fun toLinearGrid(): MutableList<CellData> {
        val mutableList = mutableListOf<CellData>()
        for (i in this.grid.indices) {
            for (j in this.grid[i].indices) {
                mutableList.add(this.grid[i][j])
            }
        }
        return mutableList
    }
}

data class CellData(
    var type: CellType,
    val position: Position,
    val isVisited: Boolean = false,
    val isShortestPath: Boolean = false,
    var distance: Int = Int.MAX_VALUE,
    var previousShortestCell: CellData? = null,
    var id: Int = (0..Int.MAX_VALUE).random()
)
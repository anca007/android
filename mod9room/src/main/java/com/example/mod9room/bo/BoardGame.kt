package com.example.mod9room.bo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

enum class Type{
    BOARD, DECK_BUILDING, CARDS, COOP
}

enum class Theme{
    FANTASTIC, WESTERN, SF, HORROR
}
@Entity
data class BoardGame(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0,
    val name : String,
    @ColumnInfo("min_player")
    val nbPlayerMin : Int,
    val nbPlayerMax : Int,
    val type : Type,
    val theme : Theme
)

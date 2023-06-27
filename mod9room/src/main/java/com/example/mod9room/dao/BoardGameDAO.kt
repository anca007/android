package com.example.mod9room.dao

import androidx.room.*
import com.example.mod9room.bo.BoardGame

@Dao
interface BoardGameDAO {

    @Insert
    fun insert(boardGame: BoardGame) : Long

    @Update
    fun update(boardGame: BoardGame)

    @Delete
    fun delete(boardGame: BoardGame)

    @Query("SELECT * FROM BoardGame WHERE id = :id")
    fun getById(id : Long) : BoardGame

    @Query("SELECT * FROM BoardGame")
    fun getAll() : List<BoardGame>

}
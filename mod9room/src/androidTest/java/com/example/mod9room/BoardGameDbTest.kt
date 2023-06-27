package com.example.mod9room

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.mod9room.bo.BoardGame
import com.example.mod9room.bo.Theme
import com.example.mod9room.bo.Type
import com.example.mod9room.db.AppDatabase
import junit.framework.TestCase.assertTrue
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BoardGameDbTest {

    lateinit var db : AppDatabase

    @Before
    fun createDb(){
       db = Room.inMemoryDatabaseBuilder(
           ApplicationProvider.getApplicationContext(),
           AppDatabase::class.java
       ).build()
    }

    @Test
    fun testInsertBoardGame(){
        val game = BoardGame(
            0,
            "Dixit",
            3,
            8,
            Type.CARDS,
            Theme.FANTASTIC)

        val id = db.getBoardGameDAO().insert(game)

        assertTrue("Jeu non valide !",
            db.getBoardGameDAO().getById(id).name == "Dixit")
    }


}
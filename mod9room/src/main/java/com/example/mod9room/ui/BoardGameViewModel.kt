package com.example.mod9room.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.mod9room.bo.BoardGame
import com.example.mod9room.dao.BoardGameDAO
import com.example.mod9room.db.AppDatabase
import kotlinx.coroutines.launch

class BoardGameViewModel(private val boardGameDAO: BoardGameDAO) : ViewModel() {

    var boardGame = MutableLiveData<BoardGame?>(null)

    fun addGame(boardGame: BoardGame) : MutableLiveData<Long> {
        var id = MutableLiveData<Long>()
        viewModelScope.launch {
            id.value = boardGameDAO.insert(boardGame)
        }
        return id
    }

    fun getGame(id : Long){
        viewModelScope.launch {
            boardGame.value = boardGameDAO.getById(id)
        }
    }



    companion object{

        val Factory : ViewModelProvider.Factory = object : ViewModelProvider.Factory {

            override fun <T : ViewModel> create(
                modelClass: Class<T>,
                extras: CreationExtras): T {

                val application = checkNotNull(extras[APPLICATION_KEY])

                // instanciation du ViewModel en prenant en compte l'ajout de la dao
                //dans le constructeur
                return BoardGameViewModel(
                    AppDatabase.getInstance(application.applicationContext).getBoardGameDAO()
                ) as T

            }
        }
    }



}
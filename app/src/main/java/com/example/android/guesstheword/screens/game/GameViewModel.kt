package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    //The current word
    var word = ""

    var score = 0

    private lateinit var wordList : MutableList<String>

    private fun resetList() {
        wordList = mutableListOf(
            "queen",
            "hospital",
            "basketball",
            "cat",
            "change",
            "snail",
            "soup",
            "calendar",
            "sad",
            "desk",
            "guitar",
            "home",
            "railway",
            "zebra",
            "jelly",
            "car",
            "crow",
            "trade",
            "bag",
            "roll",
            "bubble"
        )
        wordList.shuffle()
    }
    init {
        Log.i("GameViewModel", "GameViewModel Created!")
    }

    private fun nextWord(){
        if(!wordList.isEmpty()){
            word = wordList.removeAt(0)
        }
    }

    override fun onCleared(){
        super.onCleared()
        Log.i("GameViewModel", "GameViewModel Destroyed!")
    }

    fun onSkip() {
        score--
        nextWord()
    }

    fun onCorrect() {
        score++
        nextWord()
    }
    init {
        resetList()
        nextWord()
        Log.i("GameViewModel", "GameViewModel Created!")
    }
}
package com.example.roomwordsample.repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.roomwordsample.data.entities.Word
import com.example.roomwordsample.data.daos.WordDao

class WordRepository(private val wordDao: WordDao) {

    val allWords:LiveData<List<Word>> = wordDao.getAllWords()

    @WorkerThread
    suspend fun insert(word: Word){
        wordDao.insert(word)
    }


}
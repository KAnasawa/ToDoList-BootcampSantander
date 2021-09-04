package com.example.todolist_bootcampsantander.datasource

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.todolist_bootcampsantander.model.Task

@Dao
interface Dao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(task: Task)

    @Query("SELECT * FROM Task")
    fun getAll(): LiveData<List<Task>>
}
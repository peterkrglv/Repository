package com.example.todolist;

import androidx.room.Insert;
import androidx.room.Query;

import io.reactivex.Completable;
import io.reactivex.Observable;

public interface TaskDao {
    @Insert
    Completable addTask(Task task);

    @Query("SELECT * FROM taskTable WHERE id = :id")
    Observable<Task> getTask(int id);
}

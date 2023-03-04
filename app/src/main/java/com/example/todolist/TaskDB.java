package com.example.todolist;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Task.class}, version = 1)
public abstract class TaskDB extends RoomDatabase {

    public abstract TaskDao taskDao();

    private static TaskDB instance;
    public static TaskDB getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), TaskDB.class, "task_statement").build();
        }//присвоить переменной instance новый экземпляр класса TaskDB
        return null;
    }
}

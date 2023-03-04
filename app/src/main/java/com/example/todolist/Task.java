package com.example.todolist;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName="taskTable")
public class Task {
    @PrimaryKey(autoGenerate=true)
    int id;
    private String taskName;
    private String taskDesk;

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDesk() {
        return taskDesk;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public int getId() {
        return id;
    }

    public Task(int id) {
        this.id = id;
    }

    public Task(String taskName, String taskDesk, Boolean isCompleted) {
        this.taskName = taskName;
        this.taskDesk = taskDesk;
        this.isCompleted = isCompleted;
    }

    private Boolean isCompleted;
}

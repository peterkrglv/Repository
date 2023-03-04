package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TaskDB taskDB = TaskDB.getInstance(this);
        TaskDao taskDao = taskDB.taskDao();

        taskDao.addTask(new Task("Task one", "description", false)).subscribeOn(Schedulers.io()).subscribe(() -> {});

        taskDao.getTask(0).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).
                subscribe(new Observer<Task>() {
                              @Override
                              public void onSubscribe(Disposable d) {

                              }

                              @Override
                              public void onNext(Task task) {

                              }

                              @Override
                              public void onError(Throwable e) {

                              }

                              @Override
                              public void onComplete() {

                              }
                          });

                        Log.d("myLog", taskDao.getTask(0).toString());

    }
}
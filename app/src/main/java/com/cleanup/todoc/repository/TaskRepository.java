package com.cleanup.todoc.repository;

import android.app.Application;

import com.cleanup.todoc.TodocDatabase;
import com.cleanup.todoc.dao.TaskDao;

public class TaskRepository {

    private TaskDao mDao;

    TaskRepository(Application application) {
        TodocDatabase db = TodocDatabase.getInstance(application);
        mDao = db.taskDao();
    }
}

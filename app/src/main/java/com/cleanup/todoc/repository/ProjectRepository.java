package com.cleanup.todoc.repository;

import android.app.Application;

import com.cleanup.todoc.TodocDatabase;
import com.cleanup.todoc.dao.ProjectDao;

public class ProjectRepository {
    private ProjectDao mDao;

    ProjectRepository(Application application) {
        TodocDatabase db = TodocDatabase.getInstance(application);
        mDao = db.projectDao();
    }
}

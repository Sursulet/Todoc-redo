package com.cleanup.todoc;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.cleanup.todoc.model.Project;
import com.cleanup.todoc.model.Task;

@Database(entities = {Project.class, Task.class}, version = 1, exportSchema = false)
public class TodocDatabase extends RoomDatabase {
}
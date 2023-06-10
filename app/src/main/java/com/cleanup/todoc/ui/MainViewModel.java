package com.cleanup.todoc.ui;

import androidx.lifecycle.ViewModel;

import com.cleanup.todoc.model.Task;
import com.cleanup.todoc.repository.ProjectRepository;
import com.cleanup.todoc.repository.TaskRepository;

public class MainViewModel extends ViewModel {

    private ProjectRepository mProjectRepository;
    private TaskRepository mTaskRepository;

    public MainViewModel(ProjectRepository projectRepository, TaskRepository taskRepository) {
        this.mProjectRepository = projectRepository;
        this.mTaskRepository = taskRepository;
    }

    public void insert(Task task) {}
    public void delete(Task task) {}
}

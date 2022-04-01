package com.example.tasks.service;

import com.example.tasks.data.Task;
import com.example.tasks.dto.TaskDto;

import java.util.List;

public interface TaskService
{
    Task create(Task task );

    Task findById( String id );

    List<Task> all();

    void deleteById( String id );

    Task update(TaskDto taskdto, String id );
}
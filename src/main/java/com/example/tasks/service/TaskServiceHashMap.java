package com.example.tasks.service;

import com.example.tasks.data.Task;
import com.example.tasks.dto.TaskDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class TaskServiceHashMap implements TaskService {

    private HashMap<String, Task> taskHashMap = new HashMap<>();

    @Override
    public Task create(Task task)
    {
        int id = taskHashMap.size() + 1;
        task.setId(String.valueOf(id));
        taskHashMap.put(String.valueOf(id),task);
        return taskHashMap.get(String.valueOf(id));
    }

    @Override
    public Task findById(String id)
    {
        return taskHashMap.containsKey(id) ? taskHashMap.get(id) : null;
    }

    @Override
    public List<Task> all()
    {
        return new ArrayList<>(taskHashMap.values());
    }

    @Override
    public void deleteById(String id)
    {
        if(taskHashMap.containsKey(id)){
            taskHashMap.remove(id);
        }
    }

    @Override
    public Task update(TaskDto taskDto, String id)
    {
        if(taskHashMap.containsKey(id)){
            Task task = taskHashMap.get(id);
            task.update(taskDto);
            return taskHashMap.get(id);
        }
        return null;
    }
}
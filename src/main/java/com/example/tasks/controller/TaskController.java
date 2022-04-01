package com.example.tasks.controller;

import com.example.tasks.data.Task;
import com.example.tasks.dto.TaskDto;
import com.example.tasks.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(@Autowired TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public Task create(@RequestBody TaskDto taskDto)
    {
        return taskService.create(new Task(taskDto));
    }

    @GetMapping("/{id}")
    public Task findById(@PathVariable String id)
    {
        return taskService.findById(id);
    }

    @GetMapping("/all")
    public List<Task> findAll()
    {
       return taskService.all();
    }

    @PutMapping("/{id}")
    public Task updateStatus(@PathVariable String id, @RequestBody TaskDto taskDto){
        return taskService.update( taskDto, id );
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        taskService.deleteById(id);
    }

}

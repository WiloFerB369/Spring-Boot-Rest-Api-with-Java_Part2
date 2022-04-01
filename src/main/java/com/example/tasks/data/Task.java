package com.example.tasks.data;

import com.example.tasks.dto.StatusEnum;
import com.example.tasks.dto.TaskDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Task {

    private String id;

    private String name;

    private String description;

    private List<StatusEnum> status;

    private String assignedTo;

    private Date dueDate;

    private Date created;

    public Task(String id, String name, String description, String status, String assignedTo, Date dueDate, Date created) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = new ArrayList<>(Collections.singleton(StatusEnum.TODO));
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.created = new Date();
    }

    public Task(TaskDto taskDto) {
        this.name = taskDto.getName();
        this.description = taskDto.getDescription();
        this.status = new ArrayList<>(Collections.singleton(StatusEnum.TODO));
        this.assignedTo = taskDto.getAssignedTo();
        this.dueDate = taskDto.getDueDate();
        this.created = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<StatusEnum> getStatus() {
        return status;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Date getCreated() {
        return created;
    }

    public void update(TaskDto taskDto){
        this.status = new ArrayList<>(Collections.singleton(StatusEnum.valueOf(taskDto.getStatus())));

        if( taskDto.getAssignedTo() != null ){
            this.assignedTo = taskDto.getAssignedTo();
        }
    }
}

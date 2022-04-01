package com.example.tasks.dto;

import java.util.Date;
import java.util.List;

public class TaskDto {

    private String name;

    private String description;

    private String status;

    private String assignedTo;

    private Date dueDate;

    public TaskDto(String name, String description, String status, String assignedTo, Date dueDate, Date created) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public Date getDueDate() {
        return dueDate;
    }

}

package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public String getTask(int taskNumber) {
        return tasks.get(taskNumber);
    }

    public boolean addTask(String task) {
        return tasks.add(task);
    }

}

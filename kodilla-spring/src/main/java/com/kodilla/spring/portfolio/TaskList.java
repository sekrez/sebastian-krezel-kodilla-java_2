package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private final List<String> tasks;

    public TaskList(final List<String> tasks) {
        this.tasks = tasks;
    }

    public int taskAmount() {
        return this.tasks.size();
    }

    public List<String> getTasks() {
        return this.tasks;
    }

    public String getThisTask(int task){
        return tasks.get(task);
    }

    public void addTask(String task){
        tasks.add(task);
    }
}
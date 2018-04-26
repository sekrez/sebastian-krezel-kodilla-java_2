package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Board {
    @Autowired
    @Qualifier("toDoList")
    private TaskList toDoList;
    @Autowired
    @Qualifier("progressList")
    private TaskList inProgressList;
    @Autowired
    @Qualifier("doneList")
    private TaskList doneList;

    public TaskList getToDoList() {
        return this.toDoList;
    }

    public TaskList getInProgressList() {
        return this.inProgressList;
    }

    public TaskList getDoneList() {
        return this.doneList;
    }
}
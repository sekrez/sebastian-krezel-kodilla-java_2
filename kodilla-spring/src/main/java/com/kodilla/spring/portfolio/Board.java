package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class Board {
    @Autowired
    @Qualifier("createToDoList")
    private TaskList toDoList;
    @Autowired
    @Qualifier("createInProgressList")
    private TaskList inProgressList;
    @Autowired
    @Qualifier("createDoneList")
    private TaskList doneList;

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
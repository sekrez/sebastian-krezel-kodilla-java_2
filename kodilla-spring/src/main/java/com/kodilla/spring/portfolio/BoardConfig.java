package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;

@Configuration
public class BoardConfig {

    @Bean(name="toDoList")
    public TaskList createToDoList() {
        ArrayList<String> toDoList = new ArrayList<>();
        toDoList.add("First task to do in future");
        toDoList.add("Second task to do in near future");
        toDoList.add("Third task to do in future");
        toDoList.add("Fourth task to od future");
        toDoList.add("Fifth task to do in future");
        return new TaskList(toDoList);
    }

    @Bean(name="progressList")
    public TaskList createInProgressList() {
        ArrayList<String> progressList = new ArrayList<>();
        progressList.add("Board spring program writing");
        progressList.add("Next module learning on Codilla");
        progressList.add("Find a Job as Java Junior Developer");
        progressList.add("Finish module nr. 10");
        return new TaskList(progressList);
    }

    @Bean(name="doneList")
    public TaskList createDoneList() {
        ArrayList<String> doneList = new ArrayList<>();
        doneList.add("Learn basic Java");
        doneList.add("Find any work");
        doneList.add("Lost driving licence");
        doneList.add("Buy a new router");
        return new TaskList(doneList);
    }
}

package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BoardConfig {

    @Bean
    public TaskList createToDoList() {
        ArrayList<String> toDoList = new ArrayList<>();
        toDoList.add("First task to do in future");
        toDoList.add("Second task to do in near future");
        toDoList.add("Therd task to do in future");
        toDoList.add("Fourth task to od future");
        return new TaskList(toDoList);
    }

    @Bean
    public TaskList createInProgressList() {
        ArrayList<String> theProgressList = new ArrayList<>();
        theProgressList.add("Board spring program writing");
        theProgressList.add("Next module learning on Codilla");
        theProgressList.add("Find a Job as Java Junior Developer");
        theProgressList.add("Finish module nr. 10");
        return new TaskList(theProgressList);
    }

    @Bean
    public TaskList createDoneList() {
        ArrayList<String> theDoneList = new ArrayList<>();
        theDoneList.add("Learn basic Java");
        theDoneList.add("Find any work");
        theDoneList.add("");
        theDoneList.add("Buy a new router");
        return new TaskList(theDoneList);
    }
}
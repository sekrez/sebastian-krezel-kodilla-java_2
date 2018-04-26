package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BoardTestSuite {
    @Test
    public void testDidTasksBeansExist() {
        // Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        TaskList toDoList = board.getToDoList();
        TaskList inProgressList = board.getInProgressList();
        TaskList doneList = board.getDoneList();

        //Then
        Assert.assertEquals(toDoList.taskAmount(),5);
        Assert.assertEquals(inProgressList.taskAmount(), 4);
        Assert.assertEquals(doneList.taskAmount(),4);
    }

    @Test
    public void testTaskAdd() {

        // Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        TaskList toDoList = board.getToDoList();
        TaskList inProgressList = board.getInProgressList();
        TaskList doneList = board.getDoneList();

        toDoList.addTask("Six task to do in future");
        inProgressList.addTask("Write, Clean and finish Exercice 10.3");
        doneList.addTask("Finish Exercise 10.2");

        //Then
        Assert.assertEquals(toDoList.getTasks().get(toDoList.taskAmount()-1), "Six task to do in future");
        Assert.assertEquals(inProgressList.getTasks().get(inProgressList.taskAmount()-1), "Write, Clean and finish Exercice 10.3");
        Assert.assertEquals(doneList.getTasks().get(doneList.taskAmount()-1), "Finish Exercise 10.2");
    }
}


package com.kodilla.spring.portfolio;

import javafx.concurrent.Task;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        // Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        TaskList task1 = board.getToDoList();
        //Then
        System.out.println(task1.taskAmount());

    }
}

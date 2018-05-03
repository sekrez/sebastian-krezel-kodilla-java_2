package com.kodilla.hibernate.TaskListDao;

import com.kodilla.hibernate.taskList.TaskList;
import com.kodilla.hibernate.taskList.dao.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName(){

        //Given
        TaskList taskList = new TaskList("learningJava","An attempt to learn programming in Java using the Kodilla course");

        //When
        taskListDao.save(taskList);

        //Then
        List<TaskList> taskListNames = taskListDao.findByListName("learningJava");
        String searchTaskName = taskListNames.get(0).getListName();
        Assert.assertEquals(searchTaskName, "learningJava");

        //CleanUp
        taskListDao.delete(taskList.getId());
    }
}

package com.kodilla.spring.forum;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//@RunWith(ForumUser.class)
@SpringBootTest
public class ForumUserTestSuite {
    @Test
    public void testGetUsername() {
        // Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser forumUser = context.getBean(ForumUser.class);

        //When
        String name = forumUser.userName;

        //Then
        Assert.assertEquals("John Smith", name);
        System.out.println(name);
    }
}

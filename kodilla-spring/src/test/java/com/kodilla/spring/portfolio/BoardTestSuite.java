package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        //When
        TaskList toDoList = (TaskList) context.getBean("toDoList");
        toDoList.addTask("First task is inTo Do List");
        TaskList inProgressList = (TaskList) context.getBean("inProgressList");
        inProgressList.addTask("First task is in in Progress List");
        TaskList doneList = (TaskList) context.getBean("doneList");
        doneList.addTask("First task is in Done List");

        String retrievedTaskInToDoList = toDoList.getTask(0);
        String retrievedTaskInInProgressList = inProgressList.getTask(0);
        String retrievedTaskInDoneList = doneList.getTask(0);

        //Then
        Assert.assertEquals("First task is inTo Do List", retrievedTaskInToDoList);
        Assert.assertEquals("First task is in in Progress List", retrievedTaskInInProgressList);
        Assert.assertEquals("First task is in Done List", retrievedTaskInDoneList);

    }
}

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
    public void testTaskAdd(){

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("First task is in TO DO LIST");
        board.getInProgressList().getTasks().add("Second task is in IN PROGRESS LIST");
        board.getDoneList().getTasks().add("Third task is in DONE LIST");

        //Then
        Assert.assertEquals("First task is in TO DO LIST", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Second task is in IN PROGRESS LIST", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Third task is in DONE LIST", board.getDoneList().getTasks().get(0));

    }
}

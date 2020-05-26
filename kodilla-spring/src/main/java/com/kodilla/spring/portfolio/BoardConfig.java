package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard() {
        return new Board(getTaskToDoList(), getTaskInProgressLists(), getTaskDoneList());
    }

    @Bean(name = "taskToDoList")
    @Scope("prototype")
    public TaskList getTaskToDoList() {
        return new TaskList();
    }

    @Bean(name = "taskInProgressList")
    @Scope("prototype")
    public TaskList getTaskInProgressLists() {
        return new TaskList();
    }

    @Bean(name = "taskDoneList")
    @Scope("prototype")
    public TaskList getTaskDoneList() {
        return new TaskList();
    }

}

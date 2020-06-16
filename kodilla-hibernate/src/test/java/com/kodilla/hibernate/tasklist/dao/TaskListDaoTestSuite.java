package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
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
    private static final String DESCRIPTION = "TaskList: Learn Hibernate";

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("InProgress", DESCRIPTION);
        taskListDao.save(taskList);
        String taskListName = taskList.getListName();
        //When
        List<TaskList> readTaskList = taskListDao.findByListName(taskListName);
        //Then
        Assert.assertEquals(1, readTaskList.size());
        //Cleanup
        int id = readTaskList.get(0).getId();
        taskListDao.deleteById(id);
    }
}

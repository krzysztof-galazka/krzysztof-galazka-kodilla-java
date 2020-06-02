package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDrivingTask() {

        //given
        TaskFactory taskFactory = new TaskFactory();

        //when
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        boolean expectedIsTaskDoneBeforeExecuteTask = drivingTask.isTaskExecuted();
        drivingTask.executeTask();
        boolean expectedIsTaskDone = drivingTask.isTaskExecuted();

        //then
        Assert.assertFalse(expectedIsTaskDoneBeforeExecuteTask);
        Assert.assertEquals("Driving", drivingTask.getTaskName());
        Assert.assertTrue(expectedIsTaskDone);
    }

    @Test
    public void testFactoryPaintingTask() {

        //given
        TaskFactory taskFactory = new TaskFactory();

        //when
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING_TASK);
        boolean expectedIsTaskDoneBeforeExecuteTask = paintingTask.isTaskExecuted();
        paintingTask.executeTask();
        boolean expectedIsTaskDone = paintingTask.isTaskExecuted();

        //then
        Assert.assertFalse(expectedIsTaskDoneBeforeExecuteTask);
        Assert.assertEquals("Painting", paintingTask.getTaskName());
        Assert.assertTrue(expectedIsTaskDone);
    }

    @Test
    public void testFactoryShoppingFactory() {

        //given
        TaskFactory taskFactory = new TaskFactory();

        //when
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);
        boolean expectedIsTaskDoneBeforeExecuteTask = shoppingTask.isTaskExecuted();
        shoppingTask.executeTask();
        boolean expectedIsTaskDone = shoppingTask.isTaskExecuted();

        //then
        Assert.assertFalse(expectedIsTaskDoneBeforeExecuteTask);
        Assert.assertEquals("Shopping", shoppingTask.getTaskName());
        Assert.assertTrue(expectedIsTaskDone);
    }
}

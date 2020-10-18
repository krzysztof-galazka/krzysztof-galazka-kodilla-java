package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.facade.observer.homework.Mentor;
import com.kodilla.patterns2.facade.observer.homework.StudentTasksQue;
import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {
    @Test
    public void testStudentsTasks(){
        //Given
        StudentTasksQue student1 = new StudentTasksQue("Student #1");
        StudentTasksQue student2 = new StudentTasksQue("Student #2");
        StudentTasksQue student3 = new StudentTasksQue("Student #3");

        Mentor mentor1 = new Mentor("Mentor #1");
        Mentor mentor2 = new Mentor("Mentor #2");

        student1.addObserver(mentor1);
        student2.addObserver(mentor1);
        student3.addObserver(mentor1);
        student3.addObserver(mentor2);
        //When
        student1.addTask("task 1");
        student2.addTask("task 2");
        student3.addTask("task 3");
        student3.addTask("task 4");
        //Then
        Assert.assertEquals(4,mentor1.getTasksToCheck());
        Assert.assertEquals(2,mentor2.getTasksToCheck());
    }
}

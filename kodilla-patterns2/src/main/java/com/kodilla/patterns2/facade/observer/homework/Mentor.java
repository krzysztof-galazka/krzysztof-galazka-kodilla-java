package com.kodilla.patterns2.facade.observer.homework;

public class Mentor implements Observer {
    private String name;
    private int tasksToCheck;

    public Mentor(String name) {
        this.name = name;
        this.tasksToCheck = 0;
    }

    @Override
    public void update(StudentTasksQue studentTasksQue) {
        System.out.println("Mentor: " + getName() +
                ", student " + studentTasksQue.getQueOwnerName() +
                " total: " + studentTasksQue.getTasks().size() + ".");
        tasksToCheck++;
    }

    public String getName() {
        return name;
    }

    public int getTasksToCheck() {
        return tasksToCheck;
    }
}

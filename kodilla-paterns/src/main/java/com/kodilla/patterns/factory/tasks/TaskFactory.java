package com.kodilla.patterns.factory.tasks;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TaskFactory {
    public final static String DRIVING_TASK = "DRIVINGTASK";
    public final static String PAINTING_TASK = "PAINTINGTASK";
    public final static String SHOPPING_TASK = "SHOPPINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING_TASK:
                return new DrivingTask("Driving", "home", "car");
            case PAINTING_TASK:
                return new PaintingTask("Painting", "black", "picture");
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping", "milk", 2.0);
            default:
                throw new IllegalArgumentException("Wrong task!");

        }
    }
}

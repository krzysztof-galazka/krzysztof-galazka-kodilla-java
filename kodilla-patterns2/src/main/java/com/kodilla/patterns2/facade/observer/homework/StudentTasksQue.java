package com.kodilla.patterns2.facade.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class StudentTasksQue implements Observable {
    private Deque<String> tasks;
    private List<Observer> observers;
    private String queOwnerName;

    public StudentTasksQue(String queueOwnerName) {
        this.queOwnerName = queueOwnerName;
        this.tasks = new ArrayDeque<>();
        this.observers = new ArrayList<>();
    }

    public void addTask(String exercise) {
        tasks.offer(exercise);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(this);
        }
    }

    public Deque<String> getTasks() {
        return tasks;
    }

    public String getQueOwnerName() {
        return queOwnerName;
    }
}

package com.kodilla.patterns2.facade.observer.homework;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
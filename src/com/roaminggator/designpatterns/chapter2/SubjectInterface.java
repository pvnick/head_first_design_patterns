package com.roaminggator.designpatterns.chapter2;

/**
 * Created by pvnic_000 on 8/22/2015.
 */
public interface SubjectInterface {
    public void registerObserver(ObserverInterface observer);
    public void notifyObservers();
    public boolean removeObserver(ObserverInterface observer);
}

package com.vishwas.lld.designPatterns.behaviouralPatterns.ObserverDesignPattern.goodCode;

//The Subject Interface(The Channel)
public interface Subject {
    void subscribe(Subscriber sub);
    void unsubscribe(Subscriber sub);
    void notifySubscribers();
}

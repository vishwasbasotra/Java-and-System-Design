package com.vishwas.lld.designPatterns.behaviouralPatterns.ObserverDesignPattern.goodCode;

public class User implements Subscriber{
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println(this.name+" has been notified about newly uploaded video: "+videoTitle);
    }
}

package com.vishwas.lld.designPatterns.behaviouralPatterns.ObserverDesignPattern.goodCode;

public class Main {
    public static void main() {
        MyYouTubeChannel channel = new MyYouTubeChannel();

        User user1 = new User("Sonika");
        User user2 = new User("Vishwas");

        channel.subscribe(user1);
        channel.subscribe(user2);

        channel.upload("Java Design Patterns in 10 Minutes");
        channel.notifySubscribers();


        channel.unsubscribe(user2);
        channel.notifySubscribers();
    }
}

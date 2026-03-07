package com.vishwas.lld.designPatterns.behaviouralPatterns.ObserverDesignPattern.badCode;

public class Main {
    public static void main(String[] args) {
        // Create the Channel
        YouTubeChannel techChannel = new YouTubeChannel();

        // Create the Subscribers
        Subscriber user1 = new Subscriber("Sonika");
        Subscriber user2 = new Subscriber("Vishwas");

        techChannel.upload("Java Design Patterns for Beginners");

        System.out.println("--- Manual Check 1 ---");

        user1.checkUpdate(techChannel);
        user2.checkUpdate(techChannel);

        techChannel.upload("System Design Mock Interview");

        System.out.println("--- Manual Check 1 ---");
        user1.checkUpdate(techChannel);
    }
}

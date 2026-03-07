package com.vishwas.lld.designPatterns.behaviouralPatterns.ObserverDesignPattern.badCode;

public class Subscriber {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

     public void checkUpdate(YouTubeChannel channel){
        String video = channel.getLastVideoTitle();
        if(video != null) System.out.println("Notification to " + this.name + ": New video out! ->"+channel.getLastVideoTitle());
        else System.out.println("No new video uploaded");
     }
}

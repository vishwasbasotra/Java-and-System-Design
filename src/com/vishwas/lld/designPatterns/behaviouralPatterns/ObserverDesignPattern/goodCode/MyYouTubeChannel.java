package com.vishwas.lld.designPatterns.behaviouralPatterns.ObserverDesignPattern.goodCode;

import java.util.ArrayList;
import java.util.List;

public class MyYouTubeChannel implements Subject {
    private List<Subscriber> subs = new ArrayList<>();
    private String latestVideo;

    public void upload(String newVideo){
        this.latestVideo = newVideo;
        System.out.println(newVideo+" uploaded successfully!");
    }

    @Override
    public void subscribe(Subscriber sub) {
        subs.add(sub);
    }

    @Override
    public void unsubscribe(Subscriber sub) {
        subs.remove(sub);
    }

    @Override
    public void notifySubscribers() {
        for(Subscriber sub: subs){
            sub.update(this.latestVideo);
        }
    }
}

package com.vishwas.lld.designPatterns.behaviouralPatterns.ObserverDesignPattern.badCode;

public class YouTubeChannel {
    private String lastVideoTitle;

    public void upload(String lastVideoTitle) {
        this.lastVideoTitle = lastVideoTitle;
        System.out.println("New Video Uploaded: "+this.lastVideoTitle);
    }

    public String getLastVideoTitle() {
        return lastVideoTitle;
    }
}

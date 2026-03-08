package com.vishwas.lld.designPatterns.behaviouralPatterns.IteratorDesignPattern.badCode;

import java.util.List;

public class Playlist {
    private List<String> songs;

    public Playlist(List<String> songs) {
        this.songs = songs;
    }

    public void addSong(String song) {
        this.songs.add(song);
        System.out.println("New songs added: "+song);
    }

    public void playSimplePlayList(){
        for (String song: songs) {
            System.out.println("Playing: "+ song);
        }
    }

    public void playShufflePlayList(boolean shuffle){
        if(shuffle){
            System.out.println("Playing shuffled songs");
        }else {
            for (String song: songs) {
                System.out.println("Playing: "+ song);
            }
        }
    }
}

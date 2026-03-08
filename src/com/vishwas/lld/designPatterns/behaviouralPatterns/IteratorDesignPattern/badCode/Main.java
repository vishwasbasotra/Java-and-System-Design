package com.vishwas.lld.designPatterns.behaviouralPatterns.IteratorDesignPattern.badCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> songs = new ArrayList<>(List.of("In the end", "The Reason", "Carnival of rust", "21 Guns"));
        Playlist list = new Playlist(songs);

        list.addSong("Voices");

        list.playSimplePlayList();
        System.out.println("--------------------");
        list.playShufflePlayList(true);
        System.out.println("--------------------");
        list.playShufflePlayList(false);
        System.out.println("--------------------");

    }
}

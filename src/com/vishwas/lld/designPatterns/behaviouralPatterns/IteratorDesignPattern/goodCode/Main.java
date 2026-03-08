package com.vishwas.lld.designPatterns.behaviouralPatterns.IteratorDesignPattern.goodCode;

import com.vishwas.lld.designPatterns.behaviouralPatterns.IteratorDesignPattern.goodCode.Playlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> songs = new ArrayList<>(List.of("In the end fav", "The Reason Fav", "Carnival of rust", "21 Guns"));
        Playlist playlist = new Playlist(songs);

        playlist.addSong("Hello Kitty");

        System.out.println("-------------------");
        System.out.println(playlist.getSongs());

        System.out.println("-------------------");
        Iterator shuffle = playlist.setIterator("Shuffle");
        System.out.println(shuffle.hasNext());
        System.out.println(shuffle.next());

        System.out.println("-------------------");
        Iterator simple = playlist.setIterator("Simple");
        System.out.println(simple.hasNext());
        System.out.println(simple.next());

        System.out.println("-------------------");
        Iterator fav = playlist.setIterator("Fav");
        System.out.println(fav.hasNext());
        System.out.println(fav.next());
    }
}

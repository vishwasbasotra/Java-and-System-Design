package com.vishwas.lld.designPatterns.behaviouralPatterns.IteratorDesignPattern.goodCode;

import java.util.List;

public class Playlist {
    private List<String> songs;

    public Playlist(List<String> songs) {
        this.songs = songs;
    }

    public void addSong(String song) {
        this.songs.add(song);
        System.out.println("New song added: "+song);
    }

    public List<String> getSongs() {
        return songs;
    }

    public Iterator setIterator(String iterator){
        if(iterator.equals("Simple"))   return new SimpleIterator(this);
        else if (iterator.equals("Shuffle"))    return new ShuffleIterator(this);
        else if(iterator.equals("Fav")) return new FavouritePlaylist(this);
        else throw new IllegalArgumentException("Invalid iterator type");
    }

}

package com.vishwas.lld.designPatterns.behaviouralPatterns.IteratorDesignPattern.goodCode;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ShuffleIterator implements Iterator{
    private Playlist playlist;
    private int index;
    private List<String> shuffledSongs ;

    public ShuffleIterator(Playlist playlist) {
        this.playlist = playlist;
        this.index = 0;
        shuffledSongs = playlist.getSongs();
        Collections.shuffle(shuffledSongs);
    }

    @Override
    public boolean hasNext() {
        return index < shuffledSongs.size();
    }

    @Override
    public String next() {
        return shuffledSongs.get(index++);
    }
}

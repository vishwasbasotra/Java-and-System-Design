package com.vishwas.lld.designPatterns.behaviouralPatterns.IteratorDesignPattern.goodCode;

public class SimpleIterator implements Iterator{
    private Playlist playlist;
    private int index;

    public SimpleIterator(Playlist playlist) {
        this.playlist = playlist;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < playlist.getSongs().size();
    }

    @Override
    public String next() {
        return playlist.getSongs().get(index++);
    }
}

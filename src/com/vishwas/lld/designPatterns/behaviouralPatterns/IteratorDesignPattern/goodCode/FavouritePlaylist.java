package com.vishwas.lld.designPatterns.behaviouralPatterns.IteratorDesignPattern.goodCode;

public class FavouritePlaylist implements Iterator{
    private Playlist playlist;
    private int index;

    public FavouritePlaylist(Playlist playlist) {
        this.playlist = playlist;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        while(index < playlist.getSongs().size()){
            if(playlist.getSongs().get(index).contains("fav"))  return true;
            index++;
        }
        return false;
    }

    @Override
    public String next() {
        return playlist.getSongs().get(index++);
    }
}

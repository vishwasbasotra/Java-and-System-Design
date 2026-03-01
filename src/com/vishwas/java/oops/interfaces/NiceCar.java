package com.vishwas.java.oops.interfaces;

public class NiceCar {
    private Engine engine;
    private Media player = new MediaPlayer();

    public NiceCar(){
        engine = new ICEEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    public void changeEngine(Engine type){
        this.engine = type;
    }
}

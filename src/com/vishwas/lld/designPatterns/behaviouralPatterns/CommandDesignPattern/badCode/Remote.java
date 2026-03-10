package com.vishwas.lld.designPatterns.behaviouralPatterns.CommandDesignPattern.badCode;

public class Remote {
    private TV tv;

    public Remote(TV tv) {
        this.tv = tv;
    }

    public void pressOnButton(){
        tv.turnOn();
    }
    void pressOffButton(){
        tv.turnOff();
    }
    void adjustVolume(int volume){
        tv.adjustVolume(volume);
    }
    void changeChannel(int channel){
        tv.changeChannel(channel);
    }

    void pressOnChangeVolumeAndChannelButton(int channel, int volume){
        tv.turnOn();
        tv.adjustVolume(volume);
        tv.changeChannel(channel);
    }
}

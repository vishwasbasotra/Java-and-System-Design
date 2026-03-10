package com.vishwas.lld.designPatterns.behaviouralPatterns.CommandDesignPattern.badCode;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Remote remote = new Remote(tv);

        remote.pressOnButton();
        remote.pressOffButton();
        remote.adjustVolume(31);
        remote.changeChannel(12);
        remote.pressOnChangeVolumeAndChannelButton(21, 69);
    }

}

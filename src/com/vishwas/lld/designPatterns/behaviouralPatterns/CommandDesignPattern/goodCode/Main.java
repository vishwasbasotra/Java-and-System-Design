package com.vishwas.lld.designPatterns.behaviouralPatterns.CommandDesignPattern.goodCode;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Command turnOn = new TurnOnCommand(tv);
        Command turnOff = new TurnOffCommand(tv);
        Command changeChannel = new ChangeChannelCommand(tv, 12);
        Command adjustVolume = new AdjustVolumeCommand(tv, 45);

        RemoteControl remote = new RemoteControl();
        remote.setOffCommand(turnOn);
        remote.setOnCommand(turnOff);
        remote.pressOffButton();
        remote.pressOnButton();

        changeChannel.execute();
        adjustVolume.execute();
    }
}

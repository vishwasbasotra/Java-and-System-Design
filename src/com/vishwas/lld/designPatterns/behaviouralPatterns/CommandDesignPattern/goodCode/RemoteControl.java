package com.vishwas.lld.designPatterns.behaviouralPatterns.CommandDesignPattern.goodCode;

public class RemoteControl {
    Command onCommand;
    Command offCommand;

    void setOnCommand(Command onCommand){
        this.onCommand = onCommand;
    }

    void setOffCommand(Command offCommand){
        this.offCommand = offCommand;
    }

    void pressOnButton(){
        onCommand.execute();
    }

    void pressOffButton(){
        offCommand.execute();
    }
}

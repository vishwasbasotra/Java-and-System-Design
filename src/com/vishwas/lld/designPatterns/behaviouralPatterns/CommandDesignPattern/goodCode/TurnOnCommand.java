package com.vishwas.lld.designPatterns.behaviouralPatterns.CommandDesignPattern.goodCode;

public class TurnOnCommand implements Command{
    private TV tv;

    public TurnOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}

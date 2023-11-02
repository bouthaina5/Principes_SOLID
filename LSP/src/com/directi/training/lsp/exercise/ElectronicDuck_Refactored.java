package com.directi.training.lsp.exercise;

public class ElectronicDuck_Refactored extends Duck {
    private boolean _on = false;

    @Override
    public void quack() {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } 
    }

    @Override
    public void swim() {
        if (_on) {
            System.out.println("Electronic duck swim");
        } 
    }

    public void turnOn() {
        _on = true;
    }

    public void turnOff() {
        _on = false;
    }
}
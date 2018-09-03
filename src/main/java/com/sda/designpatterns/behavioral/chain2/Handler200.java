package com.sda.designpatterns.behavioral.chain2;

public class Handler200 implements Handler {

    private Handler nextHandler;

    public Handler200(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public Handler getNextHandler() {
        return nextHandler;
    }

    @Override
    public int handle(int amountOfMoney) {
        System.out.println(amountOfMoney % 200);
        return amountOfMoney % 200;
    }
}
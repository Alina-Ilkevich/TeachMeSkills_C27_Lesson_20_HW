package com.teachmeskills.lesson20.task2.model;

public class Client implements Runnable{
    private CarService service;

    public Client(CarService service) {
        this.service = service;
    }

    @Override
    public void run() {
        giveCarAway();
    }
    private void giveCarAway(){
        for (int i = 0; i < 8; i++){
            service.addCar();
        }
    }
}

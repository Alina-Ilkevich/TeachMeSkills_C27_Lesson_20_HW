package com.teachmeskills.lesson20.task2.model;

public class CarMechanic implements Runnable{
    private CarService service;

    public CarMechanic(CarService service) {
        this.service = service;
    }
    @Override
    public void run() {
        repairCar();
    }
    private void repairCar(){
        for (int i = 8; i > 0; i--) {
            service.takeAway();
        }
    }
}

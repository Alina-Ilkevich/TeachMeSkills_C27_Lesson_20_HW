package com.teachmeskills.lesson20.task2.model;

import com.teachmeskills.lesson20.task2.consts.MaxNumberConsts;

public class CarService {
    private int carCount = 0;
    public synchronized void addCar(){
        while (carCount >= MaxNumberConsts.CAR_MAX_NUMBER){
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        carCount++;
        System.out.println("Клиент добавил автомобиль на СТО. Количество автомобилей: " + carCount);
        notify();
    }
    public synchronized void takeAway(){
        while (carCount < 1){
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        carCount--;
        System.out.println("Автомеханик починил автомобиль. Количество автомобилей: " + carCount);
        notify();
    }
}

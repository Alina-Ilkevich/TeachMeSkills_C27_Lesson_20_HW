package com.teachmeskills.lesson20.task2.run;

import com.teachmeskills.lesson20.task2.model.CarMechanic;
import com.teachmeskills.lesson20.task2.model.CarService;
import com.teachmeskills.lesson20.task2.model.Client;

public class Runner {
    public static void main(String[] args) {
        CarService carService = new CarService();
        CarMechanic carMechanic = new CarMechanic(carService);
        Client client = new Client(carService);
        Thread t1 = new Thread(carMechanic);
        t1.start();
        Thread t2 = new Thread(client);
        t2.start();
    }
}

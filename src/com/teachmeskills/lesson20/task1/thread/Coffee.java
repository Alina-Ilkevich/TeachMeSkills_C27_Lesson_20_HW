package com.teachmeskills.lesson20.task1.thread;

public class Coffee extends Thread{
    private String threadName;

    public Coffee(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        drinkCoffee();
    }
    private void drinkCoffee(){
        System.out.println("Drink coffee");
    }
}

package com.teachmeskills.lesson20.task1.runnable;

public class Coffee implements Runnable{
    Thread thread;
    public Coffee(){
        thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        drinkCoffee();
    }
    private void drinkCoffee(){
        System.out.println("Drink coffe");
    }
}

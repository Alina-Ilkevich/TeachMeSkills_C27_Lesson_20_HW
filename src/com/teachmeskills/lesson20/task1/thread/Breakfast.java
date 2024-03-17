package com.teachmeskills.lesson20.task1.thread;

public class Breakfast extends Thread{
    private String threadName;

    public Breakfast(String name) {
        this.threadName = name;
    }
    @Override
    public void run(){
        breakfast();
    }
    private void breakfast(){
        System.out.println("Have breakfast");
    }
}

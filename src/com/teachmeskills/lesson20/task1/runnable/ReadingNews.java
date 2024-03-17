package com.teachmeskills.lesson20.task1.runnable;

public class ReadingNews implements Runnable{
    Thread thread;
    public ReadingNews(){
        thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        readNews();
    }
    private void readNews(){
        System.out.println("Reading news");
    }
}

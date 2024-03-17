package com.teachmeskills.lesson20.task1.thread;

public class ReadingNews extends Thread{
    private String threadName;

    public ReadingNews(String name) {
        this.threadName = name;
    }
    @Override
    public void run(){
        readNews();
    }
    private void readNews(){
        System.out.println("Reading news");
    }
}

package com.teachmeskills.lesson20.task1.thread;

import com.teachmeskills.lesson20.task1.thread.Breakfast;
import com.teachmeskills.lesson20.task1.thread.Coffee;
import com.teachmeskills.lesson20.task1.thread.ReadingNews;

public class Runner {
    public static void main(String[] args) {
        ReadingNews thread1 = new ReadingNews("thread1");
        thread1.setPriority(1);
        thread1.start();
        Breakfast thread2 = new Breakfast("thread2");
        thread2.setPriority(10);
        thread2.start();
        Coffee thread3 = new Coffee("thread3");
        thread3.setPriority(5);
        thread3.start();

    }
}

package org.core.java.thread.Executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });
        executorService.submit(()->{System.out.println(Thread.currentThread().getName());});
        executorService.submit(()->{System.out.println(Thread.currentThread().getName());});

        executorService.shutdown();


    }
}

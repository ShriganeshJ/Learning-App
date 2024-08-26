package org.core.java.thread.Executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableJobs {

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<Integer> future_A= executorService.submit(()->{
           return 10;
        });
        Future<Integer> future_B=   executorService.submit(()->{
            return 60;
        });
        System.out.println("Sum is "+future_A.get()+future_B.get());

        executorService.shutdown();





    }
}

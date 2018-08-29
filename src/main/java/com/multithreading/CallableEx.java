package com.multithreading;

import java.util.concurrent.*;

public class CallableEx {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Example example = new Example(1);
        Example example1 = new Example(2);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> task1= executorService.submit(example);
        System.out.println("task" + task1.get());
        Future<Integer> task2 = executorService.submit(example1);
        executorService.shutdown();
        executorService.awaitTermination(70000, TimeUnit.DAYS);
        System.out.println("Here...");
        System.out.println("task" + task1.get());
    }
}

class Example implements Callable<Integer> {

    int x;
    Example(int x){
        this.x = x;
    }
    @Override
    public Integer call() throws Exception {

        System.out.println("Inside callable");
        if(this.x == 1){
            return 1;
        }
        else{
            Thread.sleep(4000);
            throw new Exception("excepion");
        }
    }
}

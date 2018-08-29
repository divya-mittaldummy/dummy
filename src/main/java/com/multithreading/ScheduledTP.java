package com.multithreading;

import java.sql.Date;
import java.sql.Time;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Runnable{
    @Override
    public void run(){
        System.out.println("Executing task.. " );
    }
}
public class ScheduledTP {
    public static void main(String[] args) {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(2);
        Task task1 = new Task();
        Task task2 = new Task();

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        //ses.schedule(task2, 5, TimeUnit.SECONDS);
        //ses.schedule(task1, 5, TimeUnit.SECONDS);
        ses.scheduleAtFixedRate(task1, 2, 5, TimeUnit.SECONDS);

        try {
            //ses.awaitTermination(2, TimeUnit.DAYS);
        }catch (Exception e){

            System.out.println("Error..");
        }
        ses.shutdown();



        System.out.println("Hello");
    }
}

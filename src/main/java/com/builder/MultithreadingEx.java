package com.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultithreadingEx {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(9);
        integerList.add(5);
        integerList.add(2);integerList.add(3);integerList.add(7);

        Producer producer = new Producer(integerList);
        Consumer consumer = new Consumer(integerList);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();

    }


}

class Producer implements Runnable{
    List<Integer> integerList;
    Producer(List<Integer> integerList){
        this.integerList = integerList;
    }

    @Override
    public void run(){
        for(int i = 0 ; i < 10; i++){

                synchronized (integerList) {
                    if (integerList.size() == 5) {
                        try {
                            integerList.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    integerList.add(1);
                    integerList.notify();
                }
            }
    }
}

class Consumer implements Runnable{
    List<Integer> integerList;
    Consumer(List<Integer> integerList){
        this.integerList = integerList;
    }

    @Override
    public void run(){
        while(true) {
            synchronized (integerList){
                if (integerList.size() == 0) {
                    try {
                        integerList.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(integerList.remove(0));
                integerList.notify();
            }

        }
    }
}
package Misc;

import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public class EvenOdd {
    static final String name;

    static {
        name = null;
    }
    /*EvenOdd(String name){
        this.name = name;
    }*/
    public static void main(String[] args) {

        //System.out.println(name);
        //new EvenOdd("dd");
       /* Main main = new Main();
        new Thread(() -> main.printEven()).start();
        new Thread(() -> main.printOdd()).start();*/
    }
}

class Main{
    boolean printEven = false;
    int i = 0;

    public void printEven(){
        while(i < 10) {
            synchronized (this) {
                while (!printEven) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                i++;
                System.out.println(i);
                printEven = false;
                notifyAll();
            }
        }
    }


    public void printOdd(){
        while(i < 10) {
            synchronized (this) {
                while (printEven) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                i++;
                System.out.println(i);
                printEven = true;
                notifyAll();
            }
        }
    }
}

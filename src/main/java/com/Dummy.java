package com;

import com.sun.javafx.image.IntPixelGetter;
import sun.awt.Mutex;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Dummy {
    public static void main(String[] args) {

        String s = "Hello  ";
        s += "Adobe  ";
        s.trim();
        System.out.print(s);
    }

}


class A{
    static class B{

        public void print(){
            System.out.println("On");
        }


    }
}

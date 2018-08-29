package com.UpperW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class MainClass
{
    public static double sumOfList(List<? extends B> list) {
        double s = 0.0;
        for (B n : list){
                n.print();
        }
        //list.add(new C());



        return s;
    }

    public static void main(String[] args) {
        AtomicReference atomicReference = new AtomicReference();
        atomicReference.set("Divya");
        atomicReference.get();
        List<B> li = new ArrayList<B>();
        li.add(new B());
        li.add(new B());
        System.out.println("sum = " + sumOfList(li));

        List<? super B> list = new ArrayList<>();
        list.add(new C());
        list.add(new B());


        //List<Object> objList = list;
        /*for(Object b: list){

        }*/

        List<? extends B> getterList = new ArrayList<>();
        for(B b : getterList){

        }

        List<B> ll = new ArrayList<>();
        getterList = ll;
        list = ll;

        List<Object> lo = new ArrayList<>();
        //sgetterList = lo;
        list = lo;
        //List<B> lll= getterList;
        //getterList.add(new Object());
        //getterList.add(new B());

    }
}

class A{
    public void print(){
        System.out.println("A");
    }
}

class B extends A{

    public void print(){
        System.out.println("B");
    }
}

class C extends B{
    public void print(){
        System.out.println("C");
    }
}
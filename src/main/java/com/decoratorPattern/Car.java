package com.decoratorPattern;

public class Car implements ChildCar{
    Car(){
        System.out.println("Creating car..");
    }

    public void build(){
        System.out.println("Building car");
    }

}

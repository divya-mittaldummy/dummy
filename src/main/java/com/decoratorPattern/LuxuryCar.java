package com.decoratorPattern;

public class LuxuryCar implements ChildCar{

    LuxuryCar(Car c){
        super();
        System.out.println("Creates luxury car");

    }

    public void build(){
        //c.build();
        System.out.println("Luxury car..");
    }
}

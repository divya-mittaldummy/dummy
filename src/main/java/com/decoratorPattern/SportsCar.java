package com.decoratorPattern;

public class SportsCar implements ChildCar{
    Car c;

    SportsCar(Car c){
      super();
        System.out.println("Cteates spoets car");
    }

    public void build(){
        c.build();
        System.out.println("Sports car..");
    }
}

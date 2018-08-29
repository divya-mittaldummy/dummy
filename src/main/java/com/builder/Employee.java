package com.builder;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

interface Sayable{
    void say();
}

public class Employee {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;

        addition.operate(2, 3);

        //Method reference

        List<Age> ageList = new ArrayList<Age>();

        Sayable sayable   = Employee::saySomething;
        sayable.say();

        Collections.sort(ageList, (age1, age2) -> {
            if (age1.equals(age2)) {
                return 0;
            }else return 1;

        });
    }
    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }

}

class Age{
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
@FunctionalInterface
interface MathOperation{
    int operate(int a, int b);
}

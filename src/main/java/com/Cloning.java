package com;

public class Cloning {
    public static void main(String[] args) {
        ShallowDeepClone shallowDeepClone = new ShallowDeepClone("Divya", 9);
        DeepClass deepClass = new DeepClass();
        deepClass.setName("Hello");
        shallowDeepClone.setDeepClass(deepClass);
        try {
            ShallowDeepClone shallowDeepClone1 = (ShallowDeepClone)shallowDeepClone.clone();
            //DeepClass deepClass1 = (DeepClass) deepClass.clone();
            System.out.println(shallowDeepClone1.getStr());
            System.out.println(shallowDeepClone1.getI());
            System.out.println(shallowDeepClone1.getDeepClass().getName());
            shallowDeepClone.getDeepClass().setName("Sum");

            System.out.println(shallowDeepClone1.getDeepClass().getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}

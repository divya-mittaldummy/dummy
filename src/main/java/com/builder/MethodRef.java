package com.builder;

import java.util.function.BiFunction;

class Arithmetic{
    public static int add(int a, int b){
        return a + b;

    }
}
public class MethodRef
{


    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = Arithmetic::add;
        System.out.println(biFunction.apply(3, 5));
    }
}

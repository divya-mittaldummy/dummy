package com.builder;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicatEx {

    Predicate<Integer> predicate  = a ->
    {
        if (a > 2) return true;
        else return false;
    };

    final static Integer count = 1;

    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<Integer>();
        integers.add(2);
        integers.add(3);
        integers.add(2);
        integers.add(3);
        integers.add(2);
        integers.add(3);

        List<Integer> uniqueInteger = integers.stream().distinct().collect(Collectors.toCollection(LinkedList::new));

        synchronized (count){

        }
    }
}

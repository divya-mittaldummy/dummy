package com.collection;

import java.util.*;

public class ListEx {

    static List<Integer> integerList = new ArrayList<Integer>();
static HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();


    public static void main(String[] args) {
        hashMap.put(null, 3);
        hashMap.put(1, 3);

        for(Map.Entry entry: hashMap.entrySet()){
            entry.getKey();
            hashMap.put(3, 7);
        }


        System.out.println(hashMap.get(null));
        integerList.add(4);
        integerList.remove(0);
        LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();

        Set<Integer> hashIntegerSet = new TreeSet<Integer>();
        TreeSet<Employee> employeeTreeSet = new TreeSet<Employee>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return 0;
            }
        });
        employeeTreeSet.add(new Employee());
    }
}

class Employee{
    String name;
}

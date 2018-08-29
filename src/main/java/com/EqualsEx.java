package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EqualsEx {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2, 1, 7, 5);
        Collections.sort(list);
        list.forEach(a -> System.out.println(a));

        ComEmployee comEmployee = new ComEmployee();
        comEmployee.setName("Divya");

        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.setName("Divya");
        //contractEmployee.setTime();
        Object comEmployee1 = new ComEmployee();
        comEmployee.setName("Divya");

        System.out.println(comEmployee.equals(contractEmployee));
        System.out.println(contractEmployee.equals(comEmployee));
    }
}

class ComEmployee{
    String name;

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }

        if(o== null || !(o instanceof ComEmployee))
            return false;

        ComEmployee comEmployee = (ComEmployee) o;
        if(comEmployee.name != null && comEmployee.name.equalsIgnoreCase(this.name)){
            return true;
        }
        return false;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class ContractEmployee extends ComEmployee{

    String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }

        if(o== null || !(o instanceof ContractEmployee))
            return false;

        ContractEmployee comEmployee = (ContractEmployee) o;
        if(comEmployee.name != null && comEmployee.name.equalsIgnoreCase(this.name)
                && comEmployee.time != null && comEmployee.time.equalsIgnoreCase(this.time)){
            return true;
        }
        return false;

    }
}
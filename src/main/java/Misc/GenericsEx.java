package Misc;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx {
    public static void main(String[] args) {


        List<? extends Number> list = new ArrayList<Number>();
        List<? extends Number> list1 = new ArrayList<Integer>();
        List<? extends Number> list2 = new ArrayList<Double>();

        List<? super Integer> list3 = new ArrayList<Integer>();
        List<? super Integer> list4 = new ArrayList<Number>();
        List<? super Integer> list5 = new ArrayList<Object>();
        readOO(list5);
    }

    public <T extends Number> void readO(List<T> list)
    {
        for(Number number: list){

        }
    }

    public static void readOO(List<? super Integer> list)
    {
        list.add(new Integer(1));
        //list.add(new Object());
        /*for(Number number: list){

        }*/
    }

}



class AA{

}

class BB extends AA{

}

class CC extends BB{

}

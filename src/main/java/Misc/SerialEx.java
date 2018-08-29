package Misc;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.concurrent.Semaphore;

public class SerialEx {
    public static void main(String[] args)
    {
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap(16, 0.75f, true);
        hm.put(1,1);
        hm.put(2,1);
        hm.put(3,1);
        hm.put(4,1);

        hm.entrySet().stream().forEach(a -> System.out.println(a));
        hm.get(2);
        hm.entrySet().stream().forEach(a -> System.out.println(a));
        hm.put(5,1);
        hm.entrySet().stream().forEach(a -> System.out.println(a));
        HashMap hm1 = new HashMap();
        hm1.put(1, 1);
        hm.putAll(hm1);

        //LinkedList
        ArrayList<String> arr = new ArrayList<String >();
        ArrayList<Integer> bbb = new ArrayList<Integer>();
        //arr = bbb;
        //bbb = arr;
        bbb.add(null);
        //bbb.forEach( a -> System.out.println(a));
        for(Object i : bbb){

        }

       // hm.entrySet().stream().forEach((a) -> System.out.println(a));
        //hm1 = hm;

        /*hm.put("as", "a");
        hm.putAll(hm);*/

        Car car = new Car("Shubham", 1995);
//        A newcar = null;

        // Serialize the car
        try {
            FileOutputStream fo = new FileOutputStream("gfg.txt");
            ObjectOutputStream so = new ObjectOutputStream(fo);
            so.writeObject(car);
            so.flush();
        }
        catch (Exception e) {
            System.out.println(e);
        }

        // Deserializa the car
        A newcar = null;
        try {
            FileInputStream fi = new FileInputStream("gfg.txt");
            ObjectInputStream si = new ObjectInputStream(fi);
            newcar = (A)si.readObject();
        }
        catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("The original car is:\n" + car);
        System.out.println("The new car is:\n" + newcar+ " " + newcar.a );
    }
}

class A{
public int a;
/*A(){

}*/
    A(int a){
//this.a = a;
    }
}

class B extends A {
//C c = new C();
int j;
B(int a){

    super(a);
    this.j = a;
}
}

class C{

}


class Car extends A implements Externalizable {
    static int age;
    String name;
    int year;

    public Car()
    {
        super(1);
        System.out.println("Default Constructor called");
    }

    Car(String n, int y)
    {
        super(1);
        name = n;
        year = y;
        age = 10;
    }

    public void get(){}
    public void writeExternal(ObjectOutput out)
            throws IOException
    {
        out.writeObject(name);
        out.writeInt(age);
        out.writeInt(year);
    }
    public void readExternal(ObjectInput in)
            throws IOException, ClassNotFoundException
    {
        name = (String)in.readObject();
        year = in.readInt();
        age = in.readInt();
    }
    public String toString()
    {
        return ("Name: " + name + "\n" +
                "Year: " + year + "\n" +
                "Age: " + age);
    }
}


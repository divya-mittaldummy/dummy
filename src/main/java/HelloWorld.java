




import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.Log4JLogger;

import java.io.*;
import java.util.HashMap;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        Log log = null;
        //log.debug("aa");
        /*HashMap<Integer, Integer> hmap = new HashMap<>();
        ObjectOutputStream objectOutputStreamStream = new ObjectOutputStream(new FileOutputStream("aa"));
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("aa"));
        System.out.println("Hello");*/

        Integer i = -2147483648;
        Integer j = -2147483648;

        System.out.println(Integer.MIN_VALUE);
        System.out.println(j);
        System.out.println(i == j);

        HCEx hcEx = new HCEx(new String("Divya"));
        HCEx hcEx1;;// = new HCEx(new String("Sumit"));

        hcEx1 = hcEx;
        /*String a = new String("a");
        String a1 = new String("a");
        System.out.println(a.hashCode());
        System.out.println(a1.hashCode());
        System.out.println(hcEx.hashCode());
        System.out.println(hcEx1.hashCode());*/
        HashMap<HCEx, String> hmap = new HashMap<>();
        hmap.put(hcEx, "Divya");
        hmap.put(hcEx1, "Sumit");
        System.out.println(hmap.size());
        System.out.println(hmap.get(hcEx));
        System.out.println(hmap.get(hcEx1));
    }

}

class HCEx{
    String name;
    HCEx(String name){
        this.name = name;
    }


    public boolean equals(Object o){
        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


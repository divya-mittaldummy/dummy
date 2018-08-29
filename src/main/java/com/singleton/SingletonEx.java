package com.singleton;

public class SingletonEx {
    private static SingletonEx singletonEx = null;

    private SingletonEx(){
    }

    public static SingletonEx getSingletonEx() {
        if(singletonEx == null) {
            synchronized (SingletonEx.class) {
                if(singletonEx == null) {
                    singletonEx = new SingletonEx();
                }
            }
        }
        return  singletonEx;
    }
}

class GetObject{
    public static void main(String[] args) {
        SingletonEx singletonEx = SingletonEx.getSingletonEx();
        Integer i = 300;
        Integer j = 300;
        System.out.println(i.equals(j));
        //String
    }
}

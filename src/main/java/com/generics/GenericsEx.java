package com.generics;

public class GenericsEx {

    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        Utility<A> utility = new Utility<A>(b);
        utility.print();
        Utility<A> utility1 = new Utility<A>(c);
        utility1.print();

    }
}

class Utility<T>{

    T obj;
    Utility(T obj){
        this.obj = obj;
    }
    public void print(){
        A a = (A)obj;
        System.out.println(((A) obj).getValue());

    }
}

interface A{
    public Integer getValue();
}

class B implements A{
    public Integer getValue(){
        return 4;
    }
}

class C implements A{
    public Integer getValue(){
        return 3;
    }
}
package com.overriding;

public class Test{
    public static void main(String[] args) {
        A a = new A(2);
        a.check();
        a.helloWorld();
        a.print();

        A b = new B();
        b.check();
        b.helloWorld();
        b.print();


    }
}
class A {

    A(){

    }

    A(int a){

    }
    static public void print(){
        System.out.println("In Class A");
    }

    public void helloWorld(){
        System.out.println("Class A.. Hello World");
    }

    protected void check(){
        System.out.println("Class A. Check..");
    }
}

class B extends A{

    B(){

    }
    @Override
    public void helloWorld() {
        System.out.println("Class B.. hello world");
    }

    @Override
    public void check(){
        System.out.println("Class B. check");
    }


    static public void print(){
        System.out.println("Class B. prnt..");
    }
}

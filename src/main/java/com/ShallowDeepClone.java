package com;

public class ShallowDeepClone implements Cloneable{
    String str;
    int i;
    DeepClass deepClass;

    ShallowDeepClone(){

    }

    public DeepClass getDeepClass() {
        return deepClass;
    }

    public void setDeepClass(DeepClass deepClass) {
        this.deepClass = deepClass;
    }

    public String getStr() {
        return str;

    }

    public int getI() {
        return i;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setI(int i) {
        this.i = i;
    }

    ShallowDeepClone(String str, int i){
        this.str = str;
        this.i = i;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ShallowDeepClone shallowDeepClone = (ShallowDeepClone) super.clone();
        shallowDeepClone.deepClass = (DeepClass)deepClass.clone();
        return shallowDeepClone;
    }
}


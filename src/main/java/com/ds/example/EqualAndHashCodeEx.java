package com.ds.example;

import java.util.HashMap;

class A
{

    public A(int i)
    {
        this.i=i;
    }

    public int getI() {
        return i;
    }

    int i;
    @Override
    public int hashCode() {
        return (int) (Math.random()*1000);
    }

    @Override
    public boolean equals(Object obj) {
        A a = (A) obj;
        return (a.i == this.i);

    }
}

public class EqualAndHashCodeEx {

    public static void main(String[] args) {

        A a1 = new A(1);

        A a2 = new A(2);
        A a3 = new A(3);
        A a4 = new A(4);
        HashMap<A,String> hm  = new HashMap<A, String>();
        hm.put(a1,"1");
        hm.put(a2,"2");
        hm.put(a3,"3");
        hm.put(a4,"4");

        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a3.hashCode());
        System.out.println(a4.hashCode());

        System.out.println(hm.get(a1));


    }
}

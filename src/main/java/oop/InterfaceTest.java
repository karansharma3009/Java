package oop;

interface abc
{
    final static int i=20;
    public abstract  void getI();
}

class Abcd implements abc
{
    int i = 30;
    final int b = 30;

    public void getI()
    {
        System.out.println(i);
    }

}
public class InterfaceTest
{
    public static void main(String[] args) {
        abc a = new Abcd();

        a.getI();
    }
}


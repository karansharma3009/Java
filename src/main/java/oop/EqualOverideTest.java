package oop;

import java.util.HashMap;
import java.util.Map;

class Person
{
    String name;
    int age;

    public Person(String s , int age)
    {
        this.age = age;
        this.name = s;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                person.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return 10;
    }
}

public class EqualOverideTest {

    public static void main(String[] args) {
        Person p1= new Person("Karan",32);
        Person p2 = new Person( "Karan",32);
        Person p3 = new Person( "KaranS",32);


        Map<Person,String> hm = new HashMap<Person,String>();

        hm.put(p1,"Karan");
        hm.put(p2,"Sharma");
        hm.put(p3,"Sharma");


        System.out.println(p1.equals(p2));

    }

}

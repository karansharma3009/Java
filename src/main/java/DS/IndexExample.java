package DS;

import java.util.ArrayList;
import java.util.List;

public class IndexExample {

    public static void main(String[] args) {

        List< String > list = new ArrayList<String>();

        list.add("ddddddd");
        list.add("eeeee");
        list.add("ffffffff");
        // list.set(1,"ddddddd");
        // list.set(2,"eeeee");
        // list.set(2,"ffffffff");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        list.set(0,"aaaaa");
        System.out.println(list.get(0));
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

    }
}

package DS;

import java.util.Arrays;

final class ImmutableClass {



    private final int num;
    private final String age;

    public int[] getArrl() {
        return arrl;
    }

    private final int[] arrl;

    // Constructor Performing Deep Copying /Cloning
    public ImmutableClass(int num, String age, int[] arr) {
        this.num = num;
        this.age = age;
        int ab[] = new int[arr.length];
        ab [0] = arr[0];ab [1] = arr[1];ab [2] = arr[2];
        this.arrl = ab;
    }

    // Constructor Performing Shallow Copying /Cloning
  /*  public ImmutableClass(int num, String age, int[] arr) {
        this.num = num;
        this.age = age;
        this.arrl = arr;
    }*/

    public int getNum() {
        return num;
    }

    public String getAge() {
        return age;
    }





}

public class ImmutableClassEx

{

    public static void main(String[] args) {
        String s = "Karan";
        int i = 10;
        int arr[] = {2,4,10};
        ImmutableClass ic = new ImmutableClass(i , s , arr);

        s = "Sharma";
        i =20;
        arr[0] = 3;

        System.out.println(ic.getAge());
        System.out.println(ic.getNum());
        System.out.println(Arrays.toString(ic.getArrl()));

        // Shallow cloning return
       /* Karan
        10
        [3, 4, 10]*/

       // Deep Cloning returns
         /* Karan
        10
        [2, 4, 10]*/

    }
}


// Rules for Immutable Class

       /* Declare the class as final so it can’t be extended.
        Make all fields private so that direct access is not allowed.
        Don’t provide setter methods for variables
        Make all mutable fields final so that it’s value can be assigned only once.
        Initialize all the fields via a constructor performing deep copy.
        Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.*/
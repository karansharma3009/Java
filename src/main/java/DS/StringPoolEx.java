package DS;

public class StringPoolEx {

    public static void main(String[] args ){
        String s1 = "lol";
        String s2 = "lol";
        String s3 = new String("lol");
        System.out.println( s1 == s2 );// true
        System.out.println( s2 == s3); // false
        s3.intern(); //line 1
        System.out.println( s1 == s3); // false
        s3 = s3.intern();
        System.out.println( s1 == s3 ); // true  // intern method returns reference of that string from String pool so if we only do s3
        // s3.intern we are not going to get reference and s3 is still referring to Heap Object instead of String pool object

   }

}

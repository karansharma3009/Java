package DS;

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        String str = "aabcdefhhhuidffff";


        char c[] = new char[256];

        for ( int i=0;i<str.length();i++)
        {
            c[str.charAt(i)] = (char) (c[str.charAt(i)]+ 1);
        }

        for ( int i=0 ;i<c.length;i++)
        {
            if( c[i]>1)
            {
                System.out.println((int)c[i]+ "---"+(char)i) ;
            }
        }

    }

}

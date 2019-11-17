package DS;

import java.util.HashMap;
// kADANE aLgO FOR FINDING MAXIMUM SUM OF AN SUBARRAY
public class Solution4 {

    public static void main(String[] args) {

         int a[] = {1, 2, -1 , -1, 2, 4, -5};

          int n =a.length;

          int localmax = 0;
          int globalmax = Integer.MIN_VALUE;

          for ( int i=0 ;i<n ; i++)
          {
              localmax = Math.max(a[i], a[i]+localmax);

              if ( localmax> globalmax)
              {
                 globalmax = localmax;
              }
              System.out.println(localmax +""+ globalmax);

          }
        System.out.println(globalmax);
    }
}

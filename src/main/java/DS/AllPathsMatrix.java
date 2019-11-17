package DS;

import java.util.Arrays;

public class AllPathsMatrix {

    static int path[] = new int[4*4];
   // static int a[][] = { { 1, 2, 3,4},
     //       { 5, 6, 7,8},  { 10, 11, 12 ,13},{ 14, 15, 16 ,17}}; ;
    static int a[][] = { { 1, 2, 3},
            { 4, 5, 6},  { 7, 8, 9 }}; ;
            static int noOfPaths=0;
            static int k=0;
    public static void main(String[] args) {
        Arrays.fill(path,-1);

        int i=0,j=0;

        findPath(i,j);


        System.out.println("Paths we found -> "+noOfPaths);
    }

    private static void findPath(int i, int j) {
       System.out.println(i+"-"+j);


        if (i==(a.length-1) && j==(a[0].length-1))
        {
            System.out.println("reached at end "+i+"--"+j);
            path[k]=a[i][j];
            printpath(path);
            noOfPaths++;
            return;
        }

        if ( i>(a.length-1) || j>(a[0].length-1)) {
            //path[k] =-1;
            System.out.println("returning"+i+"--"+j);
            return;
        }

        path[k] =a[i][j];
        k++;

       // System.out.println(a[i][j]);
        j=j+1;
     //   System.out.println("before find path loop 1 " + i+"-"+j);
        findPath(i,j); //0.1
        i=i+1;
        j=j-1;  // this line take a shit out of me. If you miss this traversal will be 00 - left child (0,1)- rchild - 1,1 and we need 1,0 instead of 1,1
        // in case where diagonal movements is also possible - we need ( 1,1) also and we need 3 find paths
    //    System.out.println("before find path loop 2" +i+"-"+j);
        findPath(i, j); //1.0

         // j=j-1;

     //   System.out.println("before find path loop 3 " +i+"-"+j);
        //findPath(i,j);
        path[k] =-1;
        k--;

    }

    private static void printpath(int[] path) {
        for ( int b: path)
        {
            if(b!=-1)
            {System.out.print(b+"=>");
            }
        }
        System.out.println("");
    }
}

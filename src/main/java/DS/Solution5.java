package DS;

// FINDING MAX PROFIT BY BUYING AND SELLING SHARE ( 1 TIME ONLY  ) FROM A ARRAY
public class Solution5 {

    public static void main(String[] args) {

        int a[] = {2 ,21, 1, 4, 5, 11, 5 ,21};

        int totalprofit = 0, localProfit=0;
        for ( int i = 0;i<a.length;i++)
        {
            localProfit =  findMaxOfArray( 1,a)-a[i];

            if(localProfit > totalprofit)
            {
                totalprofit = localProfit;
            }
        }
        System.out.println(totalprofit);
    }

    private static int findMaxOfArray(int index, int[] a) {
        int max = 0;
        for ( int i=index ;i<a.length;i++)
        {
            if (a[i]>max)
            {
                max =a[i];
            }
        }
        return max;
    }
}

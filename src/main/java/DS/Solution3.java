package DS;

public class Solution3 {

    public static void main(String[] args) {
        String str = "abccbd";

        String returnSt = removeAdjacent(str);
        System.out.println(returnSt);
    }

    private static String removeAdjacent(String str) {
        String s= "";
        int i=0; boolean replaceflag = false;
        while (i < str.length()-2){
            if ( str.charAt(i)==str.charAt(i+1))
            {
                replaceflag = true;
                str = str.substring(0,i)+str.substring(i+2,str.length());
              // str=  str.replace(String.valueOf(str.charAt(i)),"");
             //  str =   str.replace(String.valueOf(str.charAt(i+1)),"");
                i++;
            }
            else i++;
        }

        if (replaceflag)
        {
            return removeAdjacent(str);
        }
            else {
                return str;
            }


    }
}



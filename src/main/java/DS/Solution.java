package DS;

import java.util.Scanner;
import java.util.Stack;

class Solution{

    public static void main(String []argh) {

        Scanner sc = new Scanner(System.in);

        //while (sc.hasNext()) {
            String input ="(({()})))";
            Stack<Character> s = new Stack<Character>();
            char c[] = input.toCharArray();
        char temp ='a' ;
            for (char ch : c) {
                if (ch == '{' || ch == '[' || ch == '(') {
                    s.push(ch);
                }

                if (ch == '}' || ch == ']' || ch == ')') {
                    {
                        if (!s.empty()) {
                            temp = s.peek();
                            if ((temp == '{' && ch == '}') || (temp == '(' && ch == ')') || (temp == '[' && ch == ']')) {
                                s.pop();
                            }
                        }
                        else
                        {
                            s.push(ch);
                        }
                    }
                }
            }

            if(s.empty()){
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }

    }
//}


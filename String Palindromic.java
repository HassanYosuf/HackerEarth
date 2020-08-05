/*link to the problem
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/palindrome-check-2/description/*/
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        // Write your code here
        String S = new Scanner(System.in).nextLine();
        String P="";

        for(int i=S.length()-1;i>=0;i--)
        {
            P=P+S.charAt(i);
        }
        // System.out.println("p "+P);
        // System.out.println("S "+S);

        if(S.compareTo(P)==0)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}

/*link to the problem
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/e-maze-in-1aa4e2ac/description/*/

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        // Write your code here
        String S="";
        try
        {
               S = new Scanner(System.in).nextLine();

        }catch(Exception e){}

        int[] a = new int[]{0,0};
        char D;

        for(int i=0;i<S.length();i++)
        {
            D=S.charAt(i);

            if(D=='L')
            a[0]--;
            else if(D=='R')
            a[0]++;
            else if(D=='U')
            a[1]++;
            else if(D=='D')
            a[1]--;

        }

        System.out.println(a[0]+" "+a[1]);




    }
}

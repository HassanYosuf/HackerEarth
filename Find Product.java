/*link to the problem
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-product/description/*/
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        // Write your code here
        long size = s.nextInt();

        
        long ans = 1; int pow = ((int)Math.pow(10,9)) + 7;
        for(int i=0;i < size;i++)
        {
            long ar = s.nextInt();
            ans = (ans * ar )% pow;
        } 
        System.out.println(ans);

    }
}

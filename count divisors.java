/*Link the Problem
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/count-divisors/description/*/
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        

        // Write your code here
        Scanner in = new Scanner(System.in);
       int l=0,r=0,k=0;

        try
        {
             l=in.nextInt();
         r=in.nextInt();
         k=in.nextInt();
        } catch(Exception e){}
        int count=0;
        for(;l<=r;l++){
            if(l%k==0){
            count++;}
        }
        System.out.println(count);
    }
}

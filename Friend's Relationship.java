/*Link the Problem
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/friends-relationship-1/description/*/
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner s = new Scanner(System.in);
        try{
            int t = s.nextInt();
            while(t-->0)
            {
                int n = s.nextInt();
                int a = 1;
                int b = (n*2)-2;
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=a;j++)
                    System.out.print("*");
                    for(int j=1;j<=b;j++)
                    System.out.print("#");
                    for(int j=1;j<=a;j++)
                    System.out.print("*");

                    System.out.println();

                    a++;
                    b-=2;
                }
            } 


        }catch(Exception e){}
    }
}

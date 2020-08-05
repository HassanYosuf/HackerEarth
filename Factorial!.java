/*link to the problem
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-factorial/submissions/*/
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        int N = new Scanner(System.in).nextInt();
        int f=1;
        for(int i=1;i<=N;i++)
        {
            f=f*i;
        }
        System.out.print(f);
        
    }
}

/*Link for the Problem
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/cartag-948c2b02/description/*/
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);

        try{
            String s = sc.nextLine();
           if((s.charAt(0) + s.charAt(1)) % 2 !=0 || (s.charAt(7) + s.charAt(8)) % 2 !=0 ||(s.charAt(3) + s.charAt(4)) % 2 !=0 ||(s.charAt(4) + s.charAt(5)) % 2 !=0  )
        {
            System.out.println("invalid");
            
        }
else if(s.charAt(2)=='A' || s.charAt(2) == 'E' || s.charAt(2) == 'I'|| s.charAt(2) == 'O'|| s.charAt(2) == 'U'|| s.charAt(2) == 'Y' )
System.out.println("invalid");
 
else
{
    System.out.println("valid");
}

        }catch(Exception e){}

    }
}

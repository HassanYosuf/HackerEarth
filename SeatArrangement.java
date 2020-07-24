import java.util.*;
import java.io.*;

public class SeatArrangement {
    public static void main(String args[])throws Exception
    {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-- > 0)
        {
            int N = in.nextInt();

            /* Check the seat Number */

              N = N + 2 * (6 - (N - 1) % 12) - 1;
              System.out.print(N+" ");

        /* Check the type of a seat */

        if (N % 6 < 2)
              System.out.println("WS");
        else if (N % 6 == 2 || N % 6 == 5)
              System.out.println("MS");
        else
              System.out.println("AS");
        }
        
        
        
    }
}

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        int  N = new Scanner(System.in).nextInt();
        int i=1;
        
for(;N>0;i++)
{
    if(N-i <= 0) {System.out.println("Patlu");break;}
    N = N - i;

    if(N-i*2 <= 0) {System.out.println("Motu");break;}
    N = N - i*2;
}

}
}

import java.util.Map;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
       int nu=25;
       int sqrt= (int) Math.sqrt(nu);
       long mod=1000000007;
       long f=1;
       for(int i=1;i<=sqrt;i++)
       {
           if(nu%i==0)
           {
               f=(f*i)%mod;

               if(i!=nu/i)
               {
                   f=(f*(nu/i)%mod);
               }
           }
       }
        System.out.println(f);
    }
}

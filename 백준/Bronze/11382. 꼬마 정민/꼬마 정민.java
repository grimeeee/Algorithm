import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args){
        BigInteger A,B,C;
       
        Scanner sc = new Scanner(System.in);
        A = sc.nextBigInteger();
        B = sc.nextBigInteger();
        C = sc.nextBigInteger();
        
        sc.close();
        
        System.out.print((A.add(B)).add(C));
    }
}
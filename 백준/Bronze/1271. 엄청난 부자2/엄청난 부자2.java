import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        // n = 조교가 가진 돈, m = 생명체의 수
        Scanner sc = new Scanner(System.in);

        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();
                
        sc.close();
        
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }
}
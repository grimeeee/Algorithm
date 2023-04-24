import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String M = sc.next();
        sc.close();
        
        System.out.println(N * (M.charAt(2) - '0'));
        System.out.println(N * (M.charAt(1) - '0'));
        System.out.println(N * (M.charAt(0) - '0'));
        System.out.println(N * Integer.parseInt(M));
        
    }
}
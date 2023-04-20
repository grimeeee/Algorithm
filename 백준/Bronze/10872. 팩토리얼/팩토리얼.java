import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int N, fac = 1;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.close();
        
        for(int i = 1; i <= N; i++)
            fac *= i;
        System.out.println(fac);
        
    }
}
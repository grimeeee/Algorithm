import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int N, Hongik = 1946;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.close();
        
        System.out.println(N - Hongik);
    }
}
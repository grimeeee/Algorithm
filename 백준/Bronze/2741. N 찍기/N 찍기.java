import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.close();
        
        for(int i = 1; i<=N ; i++)
            System.out.println(i);    
        
    }
}
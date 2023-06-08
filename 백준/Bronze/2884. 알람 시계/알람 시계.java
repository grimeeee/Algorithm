import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, N;
        A = sc.nextInt();
        B = sc.nextInt();
        sc.close();

        if (B < 45) {
            A--;
            N = 60 - (45 - B);
            if (A < 0) {
                A = 23;
            }
            System.out.printf("%d %d", A, N);
        }

        else {
            N = (B - 45);
            System.out.printf("%d %d", A, N);
        }

    }
}
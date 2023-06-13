import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int v = sc.nextInt();
        sc.close();

        for (int i = 0; i < N; i++) {

            if (arr[i] == v) {
                sum++;
            }
        }
        System.out.print(sum);
    }
}

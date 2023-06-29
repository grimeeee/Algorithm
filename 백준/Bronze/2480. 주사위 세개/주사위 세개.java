import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, max;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
        } else if (a == b && b != c) {
            System.out.println(1000 + a * 100);
        } else if (a != b && b == c) {
            System.out.println(1000 + b * 100);
        } else if (a != b && b != c && a == c) {
            System.out.println(1000 + a * 100);
        } else {
            if ((a > b && b > c) || (a > b && b < c && a > c)) {
                System.out.println(a * 100);
            } else if ((a < b && b < c) || (a > b && b < c && a < c)) {
                System.out.println(c * 100);
            } else {
                System.out.println(b * 100);
            }

        }
    }

}

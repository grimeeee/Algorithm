import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H, M, C, rem, divi;

        H = sc.nextInt();
        M = sc.nextInt();
        C = sc.nextInt();

        sc.close();

        rem = (M + C) % 60;
        divi = (M + C) / 60;

        if (M + C < 60) {
            System.out.println(H + " " + (M + C));
        } else {
            H += divi;
            if (H >= 24)
                H -= 24;

            System.out.println(H + " " + rem);
        }

    }

}

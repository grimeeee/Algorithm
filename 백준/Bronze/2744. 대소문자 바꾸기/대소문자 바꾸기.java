import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String str = "";

        sc.close();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);

            if (Character.isUpperCase(c)) {
                str += Character.toLowerCase(c);
            } else {
                str += Character.toUpperCase(c);
            }
        }
        System.out.println(str);
    }
}

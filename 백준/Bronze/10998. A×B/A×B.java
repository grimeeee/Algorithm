//두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;
//import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        
        System.out.print(a*b);
    }
}
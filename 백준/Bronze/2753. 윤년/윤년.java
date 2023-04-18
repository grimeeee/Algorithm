import java.util.Scanner;

//윤년구하기 
//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
public class Main{
    public static void main(String[] args){
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        sc.close();
        
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 )
            System.out.println("1");
        else
            System.out.println("0");
    }
}
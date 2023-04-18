import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger N,M,abs,sub;
        N = sc.nextBigInteger();
        M = sc.nextBigInteger();
        
        sub = N.subtract(M); //빼기
        abs = sub.abs(); //절대값
        
        System.out.println(abs);
        
/*
BigInteger 기본 연산 

더하기 : add()
빼기   : subtract()
곱하기 : multiply()
나누기 : divide()

BigInteger.abs() - 절댓값 구하기, 
negate() - 음수 구하기, 
gcd() - 최대공약수 구하기, 
max() - 최댓값 구하기, 
min() - 최솟값 구하기, 
pow() - 제곱하기

*/
    }
}
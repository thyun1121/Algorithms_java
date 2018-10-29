import java.util.Scanner;

//week3
/**
 * 
 * @author thyun.ahn
 * 재귀로 하였으나 마지막 testcase에서 시간초과됨.
 * 배열로 index마다 피보나치 결과를 담는 방법으로 가이드 받음.
 *
 */
public class Fibonacci_old {

	public static void main(String[] args) {
		Scanner sc =  new Scanner (System.in);
		int n = sc.nextInt();
		if(n<=45)		
			System.out.println(fibonacci(n));
	}
	
	public static int fibonacci(int n){
		if(n<=1)
			return n;
		return fibonacci(n-1)+fibonacci(n-2);
	}
}

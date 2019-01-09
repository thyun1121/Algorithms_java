package algorithmsJobs.course3;
import java.util.Scanner;

//week3
/**
 * 
 * @author thyun.ahn
 * 재귀로 하였으나 마지막 testcase에서 시간초과됨.
 * 배열로 index마다 피보나치 결과를 담는 방법으로 가이드 받음.
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc =  new Scanner (System.in);
		int n = sc.nextInt();
		int[] fibonacciArry = new int [46];
		
		for(int i=0; i<46; i++){
			if(i<=1)
				fibonacciArry[i]=i;
			else
				fibonacciArry[i]=fibonacciArry[i-1]+fibonacciArry[i-2];
		}
		System.out.println(fibonacciArry[n]);
	}
}

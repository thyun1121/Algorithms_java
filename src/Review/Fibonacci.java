package Review;
/**
 * 
 * @author thyun.ahn
 * 
 * Review of Fibonacci.java & Fibonacci_old.java (algorithmsJobs.course3)
 *
 */

import java.util.Scanner;

public class Fibonacci {
	public static int[] save;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println(FibonacciRecursive(N));
		
		save = new int[N+1];
		System.out.println(FibonacciArray(N));
	}
	
	public static int FibonacciArray(int N){
			
		for(int i=0; i<=N; i++){
			if(i<=1)
				save[i]=i;
			else{
				save[i] = save[i-1]+save[i-2];
			}
		}
		
		return save[N];
	}
	
	public static int FibonacciRecursive(int N){
		if(N<=1)
			return N;
		return FibonacciRecursive(N-1)+FibonacciRecursive(N-2);
	}

}

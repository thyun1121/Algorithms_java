package baekjoon;

import java.util.Scanner;

public class BJ_2004 {
	public static int[] saveTwo = new int [3];
	public static int[] saveFive = new int [3];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		count(n, 0);
		count(m, 1);
		count(n-m, 2);
		
		System.out.println(Math.min(saveTwo[0]-(saveTwo[1]+saveTwo[2]), saveFive[0]-(saveFive[1]+saveFive[2])));
	}
	
	public static void count(int N, int index){
		int cntFive = 0;
		int cntTwo = 0;
		
		for(int i=5; N/i>=1; i*=5){
			cntFive+=N/i;
		}
		saveFive[index] = cntFive;
		
		for(int i=2; N/i>=1; i*=2){
			cntTwo+=N/i;
		}
		saveTwo[index] = cntTwo;
	}
}

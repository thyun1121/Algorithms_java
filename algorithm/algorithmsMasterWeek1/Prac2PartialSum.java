package algorithmsMasterWeek1;

import java.util.Scanner;

//n부터 m까지의 합을 구하라 (1<=n,m<=10000)
//입력 2(testCase),3 5,10 1000
//출력 12, 50045
//+) 다른 방법으로는 부분합 방식 사용.
public class Prac2PartialSum {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("testCase");
		int testCase = scan.nextInt();
		
		for(int j=0; j<testCase; j++){
			int start = scan.nextInt();
			int end = scan.nextInt();
			
			int[] arry = new int[10001];
			for(int i=1; i<=10000; i++){
				arry[i] = arry[i-1]+i;
			}
			
			System.out.println(arry[end]-arry[start-1]);
		}
	}
}

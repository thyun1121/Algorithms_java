package algorithmsMasterWeek1;

import java.util.Scanner;

//1부터 N까지의 합을 구하라
//입력 2,5,10
//출력 15, 55
public class prac1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		
		for(int i=0; i<testCase; i++){
			int sumTil = scan.nextInt();
			System.out.println(getSum(sumTil));
		}
	}
	
	public static int getSum(int n){
		return n*(n+1)/2;
		
	}
}

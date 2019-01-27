package baekjoon;

import java.util.Scanner;

public class BJ_11653 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=2; N>1;){
			if(N%i==0){
				System.out.println(i);
				N/=i;
			}else
				i++;
		}
	}

}

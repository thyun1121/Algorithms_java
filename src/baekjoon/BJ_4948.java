package baekjoon;

import java.util.Scanner;

public class BJ_4948 {

	public static void main(String[] args) {
		final int MAX = 246912;
		boolean[] notPrimeArry = new boolean[MAX+1];
		findPrimes(notPrimeArry);
		
		Scanner sc = new Scanner(System.in);
		int n;
		while(true){
			n=sc.nextInt();
			if(n==0)
				break;
			
			int cnt = 0;
			for(int i=n+1; i<=2*n; i++){
				if(!notPrimeArry[i])
					cnt++;
			}
			System.out.println(cnt);
		}
	}
	
	public static void findPrimes(boolean[] notPrimeArry){
		notPrimeArry[0]=true;
		notPrimeArry[1]=true;
		
		for(int i=2; i<=notPrimeArry.length-2; i++){
			for(int j=i*2; j<=notPrimeArry.length-1; j+=i){
				if(notPrimeArry[j]==false)
					notPrimeArry[j] = true;
			}
		}
	}

}

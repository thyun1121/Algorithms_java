package algorithmsJobs;
import java.util.Scanner;

public class FindPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int num, count=0;
		for(int i=0; i<N; i++){
			num = sc.nextInt();
			for(int j=2; j<=num; j++){
				if(j==num){
					count++;
					continue;
				}				
				
				if(num%j==0)
					break;
			}
		}
		System.out.println(count);
	}
}

import java.util.Scanner;

public class StreetTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] treesArry = new int [N];
		
		for(int i=0; i<N; i++){
			treesArry[i] = sc.nextInt();
		}
		
		int findGcdgap = treesArry[1]-treesArry[0];
		for(int i=1; i<N-1; i++){
			findGcdgap = findGcd(findGcdgap, treesArry[i+1]-treesArry[i] );
		}
		
		int sum=0;
		for(int i=0; i<N-1; i++){
			sum+=(((treesArry[i+1]-treesArry[i])/findGcdgap)-1);
		}
		
		System.out.println(sum);
	}
	
	public static int findGcd(int a, int b){
		if(a<b){
			int temp;
			temp = a;
			a=b;
			b=temp;
		}
		
		while(true){
			int r = a%b;
			if(r==0)
				return b;
			a=b;
			b=r;
		}	
	}
}

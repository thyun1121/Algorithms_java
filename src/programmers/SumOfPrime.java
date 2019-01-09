package programmers;
/**
 * 
 * @author thyun.ahn
 * 
 * programmers 소수의 합.
 *
 */
public class SumOfPrime {
	
	public static boolean[] notPrime;
	public static int result = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int N = 7;
		 notPrime = new boolean[N+1];
		 findPrime (N);
		 System.out.println(result);
	}
	
	public static void findPrime(int N){
		for(int i=2; i<=N; i++){
			if(!notPrime[i]){
				result+=i;
			}				
			
			for(int j=i; j<=N; j+=i){
				if(i==j)
					continue;
				else
					notPrime[j]=true;
			}
		}
	}

}

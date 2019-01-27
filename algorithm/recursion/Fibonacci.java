package recursion;
//n번째 피보나치 수를 계산.

//f0 = 0
//f1 = 1
//fn = fn-1 + fn-2  (n>1)

//0112358
public class Fibonacci {
	public static void main(String[] args) {
		int num = 6;
		
		System.out.println(sum(6));
	}
	
	public static int sum(int n){
		if(n==0){
			return n;
		}else if(n==1){
			return n;
		}else{
			return sum(n-1)+sum(n-2);
		}
		
		
	
	}
}

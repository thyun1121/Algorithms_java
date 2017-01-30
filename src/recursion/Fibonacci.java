package recursion;
//n번째 피보나치 수를 계산.

//f0 = 0
//f1 = 1
//fn = fn-1 + fn-2  (n>1)

public class Fibonacci {
	public static void main(String[] args) {
		int result = sum(6);
		System.out.println(result);
	}
	
	public static int sum(int n){
		if(n<=1){
			return n;
		}else{
			return sum(n-1)+sum(n-2);
		}
	}
}

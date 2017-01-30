package recursion;

public class Factorial {
	public static void main(String[] args) {
		int n=5;
		int result = multiple(n);
		System.out.println(result);
	}
	
	public static int multiple(int n){
		if(n==0){
			return 1;
		}else{
			return n*multiple(n-1);
		}
		
	}

}

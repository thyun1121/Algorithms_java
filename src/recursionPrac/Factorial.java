package recursionPrac;

public class Factorial {

	public static void main(String[] args) {
		int num = 6;
		
		System.out.println(factorial(num));
	}
	
	public static int factorial(int num){
		if(num <1){
			return 1;
		}else{
			return num*factorial(num-1);
		}
	}
	
	

}

package recursionPrac;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		
		System.out.println(execFactorial(num));
	}
	
	public static int execFactorial(int num){
		if(num == 0){
			return 1;
		}else{
			return num*execFactorial(num-1);
		}
			
	}

}

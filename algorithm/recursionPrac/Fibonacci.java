package recursionPrac;

//f0 = 0
//f1 = 1
//fn = fn-1 + fn-2  (n>1)

//0112358
public class Fibonacci {

	public static void main(String[] args) {
		int num = 6;
		
		System.out.println(fibonacci(num));
	}
	
	public static int fibonacci(int num){
		if(num<2){
			return num; 
		}else{
			return fibonacci(num-1)+fibonacci(num-2);
		}
	}
	
	

}

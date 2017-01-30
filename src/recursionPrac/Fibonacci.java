package recursionPrac;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 8;
		System.out.println(sum(num));
	}
	
	public static int sum(int num){
		if(num<2){
			return num;
		}else{
			return sum(num-1)+sum(num-2);
		}
	}
	

}

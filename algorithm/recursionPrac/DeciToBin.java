package recursionPrac;

public class DeciToBin {
	public static void main(String[] args) {
		int num = 36;
		
		decimalToBin(num);
	}
	
	public static void decimalToBin(int num){
		if(num < 2){
			System.out.println(num);
		}else{
			decimalToBin(num/2);
			System.out.println(num%2);
		}
	}
}

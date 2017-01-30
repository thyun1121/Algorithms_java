package recursionPrac;

public class DeciToBin {
	public static void main(String[] args) {
		int n = 36;
		changeToBin(n);
	}
	
	public static void changeToBin(int n){
		if(n<2){
			System.out.print(n);
		}else{
			changeToBin(n/2);
			System.out.print(n%2);
		}
	}	
}

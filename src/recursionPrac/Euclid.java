package recursionPrac;

public class Euclid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 30;
		int b = 12;
		
		gcd(a, b);
		
	}
	
	public static void gcd(int a, int b){
		if(a%b == 0){
			System.out.println(b);
		}else{
			if(a<b){
				int temp = a;
				a = b;
				b = temp;
			}
			gcd(b, a%b);
		}
		
	}
	
	

}

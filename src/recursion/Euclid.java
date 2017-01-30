package recursion;

public class Euclid {
	public static void main(String[] args) {
		int a = 12;
		int b = 30;
		int result = gcd(a, b);
		
		System.out.println(result);
	}
	
	public static int gcd(int a, int b){
		if(b>a){
			int tmp = b;
			b =a;
			a = tmp;
		}
		
		if(a%b==0){
			return b;
		}
		
		
		return gcd(b, a%b);
	}
}

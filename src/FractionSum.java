import java.util.Scanner;

public class FractionSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// a/b + c/d
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int bottom = b*d;
		int top = (a*d)+(c*b);
		
		int gcd = findGcd(bottom, top);
		
		bottom/=gcd;
		top/=gcd;
		
		System.out.println(top+" "+bottom);
	}
	
	public static int findGcd(int a, int b){
		if(a<b){
			int temp;
			temp = a;
			a=b;
			b=temp;
		}
		
		while(true){
			int r = a%b;
			if(r==0)
				return b;
			
			a=b;
			b=r;
		}
	}
}

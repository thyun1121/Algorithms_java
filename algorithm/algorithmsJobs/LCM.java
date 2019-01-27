package algorithmsJobs;
import java.util.Scanner;

//week3
public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextInt();
		long b = sc.nextInt();
		
		long gcd = findGcd(a,b);
		System.out.println((a/gcd)*(b/gcd)*gcd);
	}
	
	public static long findGcd(long a, long b){
		if(a<b){
			long temp;
			temp=a;
			a=b;
			b=temp;
		}
		
		if(b==0)
			return b;
			
		while(true){
			long r = a%b;
			if( r==0 ){
				break;
			}
			a=b;
			b=r;
		}
		return b;
	}
}

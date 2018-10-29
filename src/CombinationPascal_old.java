import java.util.Scanner;

//week3
/**
 * 
 * @author thyun.ahn
 *
 *	child!/parent!*(child-parent)!
 *
 */
public class CombinationPascal_old {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int child = factorial(n);
		int parent = factorial(m);
		int childMinusParent = factorial(n-m);
		
		//System.out.println(child);
		
		System.out.println(child/(parent*childMinusParent));
	}
	
	public static int factorial(int num){
		if(num<2){
			return num;
		}
		int factorialResult = 1;
		while(num>1){
			factorialResult*=num;
			num--;
		}
		
		return factorialResult;
	}

}

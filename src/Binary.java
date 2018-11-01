import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		getBinary(N);
	}
	
	public static void getBinary(int num){
		if(num==0||num==1) System.out.print(num);
		else{
			getBinary(num/2);
			System.out.print(num%2);
		}
	}
}

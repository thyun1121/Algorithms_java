import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static int cntFive = 0;
	public static int cntTwo = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		System.out.println(Math.min(countFive(n), countTwo(n)));
	}
	
	public static int countFive(int n){
		for(int i=5; n/i>=1; i*=5){
			cntFive += n/i;
		}
		return cntFive;
	}
	
	public static int countTwo(int n){
		for(int i=2; n/i>=1; i*=2){
			cntTwo += n/i;
		}
		return cntTwo;
	}
}
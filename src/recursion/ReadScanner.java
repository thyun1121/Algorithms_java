package recursion;

import java.util.Scanner;

public class ReadScanner {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//System.out.println(in);
		read(in);
		
	}
	
	public static void read(Scanner in){
		
		//String n = in.nextLine();
		int n = in.nextInt();
		System.out.println(n);
	}
}

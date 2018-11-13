import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("배열 크기를 입력하세요");
		        
		int ArraySize = scn.nextInt();
		 
		//scn.nextLine();
		
		String[] strArray = new String[ArraySize];
		 
		System.out.println("문자열을 스페이스바로 띄워서 입력해주세요.");
		 
		String strInput = scn.next();



	}
}

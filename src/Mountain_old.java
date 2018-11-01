import java.util.Scanner;

public class Mountain_old {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		getMountain(N);
	}
	
	/**
	 * @param top
	 * 
	 * 1) top이 꼭대기가 되는 산을 출력하는 함수.
	 * 2) baseCond : top==1, 1 출력
	 * 3) getMountain(2) => 121
	 * 	  getMountain(3) => 121 3 121 
	 * 
	 * ***** 출력하니, 마지막 testcase에서 timeLimit 나타남. 
	 */
	public static void getMountain(int top){
		if(top==1)
			System.out.print(top);
		else{
			getMountain(top-1);
			System.out.print(top);
			getMountain(top-1);
		}
	}
}

package algorithmsJobs.course4;
import java.util.Scanner;

public class Mountain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println(getMountain(N));
	}
	
	/**
	 * @param top
	 * 
	 * 1) top이 꼭대기가 되는 산의 숫자열을 반환하는 함수.
	 * 2) baseCond : top==1, 1 출력
	 * 3) getMountain(2) => 121
	 * 	  getMountain(3) => 121 3 121 
	 */
	public static String getMountain(int top){
		if(top==1)
			return "1";
		else{
			return getMountain(top-1)+""+top+""+getMountain(top-1);
		}
	}
}

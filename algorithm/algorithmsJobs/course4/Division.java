package algorithmsJobs.course4;
import java.util.Scanner;

/**
 * 
 * @author thyun.ahn
 * 
 * 1) string으로 구현하니, 마지막에 지울 때(#48, #49)  두자리인 경우 제대로 지워지지 않는 현상 발생. ==> 조교는 array를 권함.
 * 2) 구현하기 전부터 너무 생각을 많이 할 필요없음.
 * 예를들어 첫숫자에 4가 나올 경우, 바로 3 그다음에 바로 2 이런식으로 출력에 맞는 답을 나오게끔 생각을 하기보다는 
 * 기준이 되는 수보다 크게 나올경우부터 동일한 경우까지 나올걸 생각하여 그냥 분기처리 해주면 됨. (기저조건)
 * 3) 그리고 재귀라고 해서 for문을 안쓰려고 하는 것 같음. 상황에 따라서 for문도 사용할 필요 있으니 선입견 갖지 말것!
 *
 */

public class Division {
	public static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//testLoop(n);
		//System.out.println("===========================");
		
		int startNum = n-1;	//첫번째에 나올 숫자.
		String str = "";	//결과를 나타낼 문자열
		int nowSum = 0;		//현재까지의 합.
		recursion(n, startNum, nowSum, str);
		System.out.println(count);
	}
	
	
	public static void recursion(int n, int startNum, int nowSum, String str){
		if(n<nowSum) return;
		if(n==nowSum){
			System.out.println(str.substring(0, str.length()-1));
			count++;
			return;
		}		
		
		for(int i=startNum; i>0; i--){
			str+=i+"+";
			recursion(n, i, i+nowSum, str);
			str = str.substring(0, str.lastIndexOf("+"));
			str = str.substring(0, str.lastIndexOf("+")+1);
		}
	}
	
	
	
//	public static int allSum(String str){
//		int sum = 0;
//		String[] arryStr = null; 
//		for(int i=0; i<str.length(); i++){
//			arryStr = str.split("+");
//		}
//		
//		for(String s : arryStr){
//			sum+=Integer.parseInt(s);
//		}
//		return sum;
//	}
	
	
	public static void testLoop (int n){
		int a = n-1;
		String strResult = "";
		
		while(a>0){
			int num = n-a;
			strResult = a+"+"+num;
			System.out.println(strResult);
			a--;
		}
	}
}

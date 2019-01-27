package algorithmsJobs;
import java.util.Scanner;

//week3
/**
 * 
 * @author thyun.ahn
 * dist가 자연수의 제곱일때 minTurn(최소횟수) 홀수이며, 
 * minTurn의 갯수는 dist포함하여 아래로 자연수만큼 있음.
 * ex) 	dist:1=>minTurn:1=>minTurnCnt:1
 * 		dist:4=>minTurn:3=>minTurnCnt:2
 * 		dist:9=>minTurn:5=>minTurnCnt:3
 * 		dist:n^2=>mintTurn:2n-1=>minTurnCnt:n
 */
public class Fmttalpha {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int dist = y-x;
		int standardNo = 0;
		
		//기준이 되는 제곱근 수를 찾는다.
		for(int i=1;;i++){
			if((i*i)>=dist){
				standardNo = i;
				break;
			}
		}
		
		//제곱근 수와 얼마나 차이나는지 계산하여 minTurnCnt범위에 있으면, minTurn반환.
		//그렇지않으면 minTurn-1 반환.
		int result = (Math.abs((standardNo*standardNo)-dist)+1)<=(standardNo)?(2*standardNo-1):(2*standardNo-2);
		
		System.out.println(result);
		
		
		

	}

}

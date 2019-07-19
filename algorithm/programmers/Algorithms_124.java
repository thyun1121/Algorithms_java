package programmers;
import java.util.Scanner;

public class Algorithms_124 {
	private int input;
	
	private String solution(int n){
		if(n < 3)	return n+"";
		
		String returnValue = "";
		int remain = -1;		
		
		while(n>0){
			remain = n%3;
			n=n/3;
			
			if(remain == 0){
				n--;
				remain = 4;
			}
			
			returnValue = remain+returnValue;
		}
		return returnValue;
	}
	
	
	private String solutionRecursion(int n){
		if(n < 1)	return "";	
		if(n < 3)	return n+"";
		
		String answer = "";
		int remain;
		
		if(n>0){
			remain = n%3;
			
			if(remain == 0){
				n--;
				remain = 4;
			}
			
			answer = solutionRecursion(n/3)+remain;
		}	
		return answer;
	}
	
	
	public static void main(String[] args) {
		Algorithms_124 ag = new Algorithms_124();
		
		Scanner sc = new Scanner(System.in);
		ag.input = sc.nextInt(); 
		
		System.out.println(ag.solution(ag.input));
		System.out.println(ag.solutionRecursion(ag.input));
	}
	

	


}

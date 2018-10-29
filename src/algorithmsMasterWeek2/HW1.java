package algorithmsMasterWeek2;

import java.util.ArrayList;
import java.util.Scanner;

//모든 순열 만들기, {1,2,3,4,5}의 모든 순열을 출력해보라.

public class HW1 {
	private boolean[] visit;
	private int N;
	
	public HW1(int N){
		this.N = N;
		this.visit = new boolean[this.N+1];
	}
	
	public void execute(ArrayList<Integer>temp){
		if (temp.size()==N){
			for(Integer i : temp)
				System.out.print(i);
			System.out.println();
			return;
		}
		for(int i=1; i<=N; i++){
			if(!visit[i]){
				temp.add(i);
				visit[i]= true;
				execute(temp);
				temp.remove(temp.size()-1);
				visit[i] = false;
				
			}
		}
	}
	
	public static void main(String[] args) {		
		//int n = 4;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=0 || n>8){
			System.out.println("out of range");
		}else{
			ArrayList<Integer> temp = new ArrayList<Integer>();
			
			HW1 prac1 = new HW1(n);
			prac1.execute(temp);	
		}
			
	}
}
package algorithmsMasterWeek2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static int sum=0;
	private static ArrayList<Integer> sumArry = new ArrayList<Integer>();
	private static boolean[] visit = new boolean[9];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numArry = new int[9];
		//{20, 7, 23, 19, 10, 15, 25, 8, 13};
		
		for(int i=0; i<numArry.length; i++){
			numArry[i] = sc.nextInt();
		}
		
		
		Arrays.sort(numArry);
		execute(numArry, 0);
	}
	
	
	public static void execute(int[] paramArry, int index){
		//paramArry char 오름차순 됨.
		
		if(Main.sumArry.size()==7){			//baseCase
			if(validation()){
				for(Integer i: Main.sumArry){
					System.out.println(i);
				}
			}
			
			return;
		}
		
		for(int i=index; i<paramArry.length; i++){
			if(!visit[i]){
				Main.sumArry.add(paramArry[i]);
				visit[i] = true;
				execute(paramArry, i);
				visit[i] = false;
				Main.sumArry.remove(Main.sumArry.size()-1);
			}
			
		}
	}
	
	
	public static boolean validation(){
		for(Integer i : Main.sumArry)
			Main.sum+=i;
		
		if(Main.sum ==100)
			return true;
		else{
			Main.sum=0;
			return false;
		}
			
	}
		
		
}

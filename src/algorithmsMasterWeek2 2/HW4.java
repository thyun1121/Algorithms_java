package algorithmsMasterWeek2;

import java.util.ArrayList;
import java.util.Arrays;

public class HW4 {
	private static int sum=0;
	private static ArrayList<Integer> sumArry = new ArrayList<Integer>();
	private static boolean[] visit = new boolean[9];

	public static void main(String[] args) {		
		int[] numArry = {20, 7, 23, 19, 10, 15, 25, 8, 13};
		Arrays.sort(numArry);
		execute(numArry, 0);
	}
	
	
	public static void execute(int[] paramArry, int index){
		//paramArry char 오름차순 됨.
		
		if(HW4.sumArry.size()==7){			//baseCase
			if(validation()){
				for(Integer i: HW4.sumArry){
					System.out.print(i+" ");
				}
			}
			
			return;
		}
		
		for(int i=index; i<paramArry.length; i++){
			if(!visit[i]){
				HW4.sumArry.add(paramArry[i]);
				visit[i] = true;
				execute(paramArry, i);
				visit[i] = false;
				HW4.sumArry.remove(HW4.sumArry.size()-1);
			}
			
		}
	}
	
	
	public static boolean validation(){
		for(Integer i : HW4.sumArry)
			HW4.sum+=i;
		
		if(HW4.sum ==100)
			return true;
		else{
			HW4.sum=0;
			return false;
		}
			
	}
		
		
}

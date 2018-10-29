package algorithmsMasterWeek2;


//HW2
import java.util.Arrays;
import java.util.Scanner;

public class HW2 {
	private static String str;
	private static boolean[] visit = new boolean[128];
	private static int popCnt=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		popCnt = sc.nextInt();	//암호에 사용되는 개수
		int numArrySize=0;
		
		numArrySize = sc.nextInt();
		
		char[] numArry = new char[numArrySize];
			//{'a','t','c','i','s','w'};
		
		for(int i=0; i<numArry.length; i++){
			numArry[i] = sc.next().charAt(0);
		}
		
		Arrays.sort(numArry);
		
		execute(numArry, 0);
	}
	
	public static void execute(char[] paramArry, int index){
		//paramArry char 오름차순 됨.
		
		if(HW2.str!= null && HW2.str.length()==popCnt){			//baseCase
			if(validation()){
				System.out.println(HW2.str);
			}
			
			return;
		}
		
		for(int i=index; i<paramArry.length; i++){
			if(!visit[paramArry[i]]){
				if(HW2.str == null){
					HW2.str = ""+paramArry[i];
				}else{
					HW2.str += paramArry[i];
				}
				
				visit[paramArry[i]] = true;
				execute(paramArry, i);
				visit[paramArry[i]] = false;
				HW2.str = HW2.str.substring(0, HW2.str.length()-1);
			}
			
		}
		//HW2.str = "";
		
	}
	
	public static boolean validation(){
		int cntMo = 0;
		int cntJa = 0;
		for(int i=0; i<HW2.str.length(); i++){
			char chr = HW2.str.charAt(i);
			switch (chr){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					cntMo++;
					break;
				default :
					cntJa++;				
					
			}
		}
		
		if(cntMo>=1 && cntJa>=2){
			return true;
		}else{
			return false;
		}
	}
	
}
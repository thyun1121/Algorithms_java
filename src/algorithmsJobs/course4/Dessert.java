package algorithmsJobs.course4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 
 * @author thyun.ahn
 * 
 * 1. deepcopy 필요.. 하지 않으면 변경된 arry로 나중에 작업하게 됨.
 * 
 * 
 *
 */
public class Dessert {
	public static String[] napkinArry = {"+","-","."};
	//public static List<String> napkinResultList = new ArrayList<String>();
	public static String[] napkinResultArry;
	public static int cnt = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		napkinResultArry = new String[N-1];
		int index = 0;
		testNapkinRecursion(N, 0, index);
		//arryRecursion(N,0, index);
		System.out.println(cnt);
	}
	
	public static void arryRecursion(int N, int arryIndex,  int index){
		if(arryIndex==N-1){
			for(String s : napkinResultArry){
				System.out.print(s);
			}
			System.out.println();
			return;
		}
		for(int i=index; i<napkinArry.length; i++){
			napkinResultArry[arryIndex] = napkinArry[i];
			arryRecursion(N, arryIndex+1, index);
		}
	}
	
	public static void testNapkinRecursion(int N, int arryIndex, int index){
		//냅킨은 숫자 사이에 있으므로, 실제 입력 수보다 한개 더 적다.
		if(arryIndex==N-1){	
			String[] calcArry = new String[2*N-1];
            String str = "";
            int allDataIndex = 0;
            for(int i=0; i<N; i++){
                str+=(i+1)+" ";
                allDataIndex = 2*i;
                calcArry[allDataIndex] = String.valueOf((i+1));
                if(i<N-1){
                    str+=napkinResultArry[i]+" ";
                    calcArry[allDataIndex+1] = napkinResultArry[i];
                }
            }
            if(calcList(calcArry)==0){
                System.out.println(str);
                cnt++;
            }
            return;
		}
		
		for(int i=index; i<napkinArry.length; i++){
			napkinResultArry[arryIndex] = (napkinArry[i]);
			testNapkinRecursion(N, arryIndex+1, index);
		}
	}
	
	
	public static String[] copyArryDataDeeply (String[] originArry){
		String[] tempArry = new String[originArry.length];
		for(int i=0; i<originArry.length; i++){
			tempArry[i] = originArry[i]; 
		}
		return tempArry;
	}
	
	
	public static int calcList(String[] calcArry){
		String[] tempArry = copyArryDataDeeply(calcArry);
		String operand = "+";
		for(int i=0; i<calcArry.length; i++){
			if(".".equals(calcArry[i])){
				int beforeIndex = Integer.parseInt(tempArry[i-1]);
				int afterIndex = Integer.parseInt(tempArry[i+1]);
				if(afterIndex<10){
					afterIndex = (beforeIndex*10)+afterIndex;
				}else{
					afterIndex = (beforeIndex*100)+afterIndex;
				}
				tempArry[i-1] = "0";
				tempArry[i] = operand;
				tempArry[i+1] = String.valueOf(afterIndex);
			}else if( "+".equals(calcArry[i]) || "-".equals(calcArry[i]) ){
				operand = calcArry[i];
			}
		}
		
		
		int sum = 0;
		int preNum = 0;
		operand = "+";
		for(int i=0; i<tempArry.length; i++){
			String val = tempArry[i];
			switch(val){
			case "+":
				operand = val;
				break;
			case "-":
				operand = val;
				break;
			default :
				preNum = Integer.parseInt(val);
				if("-".equals(operand))	sum-=preNum;
				if("+".equals(operand)) sum+=preNum;				
			}
		}
		return sum;
	}
}

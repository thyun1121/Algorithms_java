package algorithmsJobs.course4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Dessert_useArrayList {
	public static String[] napkinArry = {"+","-","."};
	public static List<String> napkinResultList = new ArrayList<String>();
	public static int cnt = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int index = 0;
		testNapkinRecursion(N, index);
		System.out.println(cnt);
	}
	
	public static void testNapkinRecursion(int N, int index){
		//냅킨은 숫자 사이에 있으므로, 실제 입력 수보다 한개 더 적다.
		if(napkinResultList.size()==N-1){	
			ArrayList<String> calcArryList = new ArrayList<String>();
			String str = "";
			for(int i=0; i<N; i++){
				str+=(i+1)+" ";
				calcArryList.add(String.valueOf((i+1)));
				if(i<N-1){
					str+=napkinResultList.get(i)+" ";
					calcArryList.add(napkinResultList.get(i));
				}
			}
			if(calcList(calcArryList)==0){
				System.out.println(str);
				cnt++;
			}
			return;
		}
		
		for(int i=index; i<napkinArry.length; i++){
			napkinResultList.add(napkinArry[i]);
			testNapkinRecursion(N, index);
			napkinResultList.remove(napkinResultList.size()-1);
		}
	}
	
	
	public static ArrayList<String> copyListDataDeeply (ArrayList<String> originList){
		ArrayList<String> tempArryList = new ArrayList<String> ();
		for(int i=0; i<originList.size(); i++){
			tempArryList.add(i, originList.get(i));
		}
		return tempArryList;
	}
	
	
	public static int calcList(ArrayList<String> calcArryList){
		ArrayList<String> tempArryList = copyListDataDeeply(calcArryList);
		String operand = "+";
		for(int i=0; i<calcArryList.size(); i++){
			if(".".equals(calcArryList.get(i))){
				int beforeIndex = Integer.parseInt(tempArryList.get(i-1));
				int afterIndex = Integer.parseInt(tempArryList.get(i+1));
				if(afterIndex<10){
					afterIndex = (beforeIndex*10)+afterIndex;
				}else{
					afterIndex = (beforeIndex*100)+afterIndex;
				}
				tempArryList.set(i-1, "0");
				tempArryList.set(i, operand);
				tempArryList.set(i+1, String.valueOf(afterIndex));
			}else if( "+".equals(calcArryList.get(i)) || "-".equals(calcArryList.get(i)) ){
				operand = calcArryList.get(i);
			}
		}
		
		
		int sum = 0;
		int preNum = 0;
		operand = "+";
		for(int i=0; i<tempArryList.size(); i++){
			String val = tempArryList.get(i);
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

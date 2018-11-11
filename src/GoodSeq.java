import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author thyun.ahn
 * 1)  처음에는 int arry/arryList를 사용하였으나, 숫자들의 비교가 힘듦. 그래서 String을 쓰는 것이 나음.
 * 2) 문자열이 좋은 순열인지 check하는 것이 힘들었음.
 *   12=> substr(0,1) == substr(1,2)
 *   123 => substr(1,2) == substr(2,3)
 *   1234 ==> substr(2,3) == substr(3,4)
 *   	  ==> substr(0,2) == substr(2,4)
 *   의 규칙을 가지므로 규칙성을 찾는 것이 힘들었음...
 *
 */
public class GoodSeq {
	public static int[] arryNum = {1,2,3};
	public static ArrayList<Integer> al = new ArrayList<Integer>();
	public static boolean stopFlag = false;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//recursionArrayList(N);
		
		//int[] arryResult = new int[N];
		//int index = 0;
		//recursionArray(N, arryResult, index);
		
		String str = "";
		recursionString(N, str);
	}
	
	public static void recursionString(int N, String str){
		
		if(!checkGoodSeq(str))	return;
		if(stopFlag) return;
		
		if(str.length()==N){
			System.out.println(str);
			stopFlag = true;
			return;
		}	
		
		for(int i=0; i<arryNum.length; i++){
			str+=arryNum[i];
			recursionString(N, str);
			str=str.substring(0,str.length()-1);
		}
	}
	
	public static void recursionArray(int N, int[] arryResult, int index){
		if(index>=N){
			for(int i : arryResult){
				System.out.print(i);
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<arryNum.length; i++){
			arryResult[index] = arryNum[i];
			recursionArray(N, arryResult, index+1);
		}
		
		
	}
	
	
	public static void recursionArrayList(int N){
		
		if(al.size()==N){
			for(int i : al){
				System.out.print(i);
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<arryNum.length; i++){
			al.add(arryNum[i]);
			recursionArrayList(N);
			al.remove(al.size()-1);
		}
	}
	
	public static boolean checkGoodSeq(String str){
		int strEnd = str.length();
		int strStart = strEnd-1;
				
		for(int i=1; i<=str.length()/2; i++){
			String s1 = str.substring(strStart-i, strEnd-i);
			String s2 = str.substring(strStart, strEnd);
			if(s1.equals(s2))
				return false;
			strStart--;
		};
		return true;
	}
}

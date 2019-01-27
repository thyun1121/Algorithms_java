package algorithmsJobs.course4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author thyun.ahn
 * 1) n자리 인수 모두 출력
 * 2) 조건에 맞는 출력
 * 3) 가지치기 - 조건에 맞지 않는다면 출력하지 말것. 
 *
 */

public class Tobin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		//자리수
		int k = sc.nextInt();		//1의 개수
		
		int[] binaryBitArry = {1,0};
		ArrayList<Integer> arryList = new ArrayList<Integer>();
		int startIndex = 0;
		
		recursive(n, k, binaryBitArry, arryList, startIndex);
	}
	
	public static void recursive(int n, int k,int[] binaryBitArry, ArrayList<Integer> arryList, int startIndex){
		if(arryList.size() == n){
			if(countInArrayList(arryList)==k){
				for(Integer i : arryList){
					System.out.print(i);
				}
				System.out.println();
			}
			
			return ;
			
		}
		
		for(int i=startIndex;i<binaryBitArry.length;i++ ){
			if( checkCond(arryList, binaryBitArry[i], n, k) ){	//
				arryList.add(binaryBitArry[i]);
				recursive(n, k,binaryBitArry, arryList, startIndex);	//startIndex가 계속 0으로 들어가므로 00, 01, 출력후 1 그리고 0이 출력됨.
				arryList.remove(arryList.size()-1);
			}
		}		
	}
	
	public static boolean checkCond(ArrayList<Integer>arryList, int nextNum, int n, int k){
		if(countInArrayList(arryList)>k)	// 1의 개수가 이미 k를 넘으면 false
			return false;
		
		if(k!=0 && arryList.size()==n-1 && countInArrayList(arryList)==0 && nextNum==0)	//k가 1이상이고, 모든 수에 1이 없으면 false
			return false;			
		
		return true;
	}
	
	public static int countInArrayList(ArrayList<Integer> arryList){	
		int cnt = 0;
		for(Integer i : arryList){
			if(i.intValue()==1)
				cnt++;
		}
		return cnt;
		
		
		
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for(Integer i : arryList){
//			Integer count = map.get(i);	
//			map.put(i, (count==null)?1:count+1);
//		}
//		return (map.get(1)==null)?0:map.get(1).intValue();
	}
}

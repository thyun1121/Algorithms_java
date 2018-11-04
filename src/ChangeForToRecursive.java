import java.util.ArrayList;
import java.util.List;

public class ChangeForToRecursive {

	public static void main(String[] args) {
		int[] arry = {0,1};
		for(int i=0; i<arry.length; i++){
			for(int j=0; j<arry.length; j++){
				System.out.println(arry[i]+""+arry[j]);
			}
		}
		
		int index = 0;
		int cnt = 2;
		
		System.out.println();
		System.out.println("=============================");
		System.out.println();
		
		List<Integer> arryList = new ArrayList<Integer>();
		
		recursive(arry, arryList, index);
	}
	
	
	
	//완전탐색
	public static void recursive(int[] arry, List<Integer> arryList, int start){
		if(arryList.size()==arry.length){
			for(Integer i : arryList){
				System.out.print(i);
			}
			System.out.println();
			return;
		}
		
		for(int i=start; i<arry.length; i++){
			arryList.add(arry[i]);
			recursive(arry, arryList, start);
			arryList.remove(arryList.size()-1);
		}
	}
}

package recursionPrac;

public class SearchDataInArry {
	public static void main(String[] args) {
		int [] arry = {1,4,93,3,19, 21};
		
		int begin = 0;
		int end = arry.length-1;
		int target = 1;
		
		
		searchDataInArry(arry, begin, end, target);
	}
	
	public static void searchDataInArry(int[] arry, int begin, int end, int target){
		if(begin>end){
			return;
		}
		
		if(arry[begin] == target){
			System.out.println(begin);
			return;
		}
		
		searchDataInArry(arry, begin+1, end, target);
	}
	
	
}

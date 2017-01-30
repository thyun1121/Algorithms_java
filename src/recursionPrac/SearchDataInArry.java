package recursionPrac;

public class SearchDataInArry {
	public static void main(String[] args) {
		int [] arry = {10, 0, 398, 2, 102, 4, 73};
		
		int begin = 0;
		int end = arry.length-1;
		int target = 4;
		
		System.out.println(searchData(arry, begin, end, target));
		
	}
	
	public static int searchData(int[] arry, int begin, int end, int target){
		if(end<begin){
			return -1;
		}else if(target == arry[begin]){
			return begin;
		}else{
			return searchData(arry, begin+1, end, target);
		}
	}
	
	
	
}

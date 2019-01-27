package recursion;

// 순차탐색 - inflearn 3회
public class SearchDataInArry { 
	
	public static void main(String[] args) {
		int [] arry = {10,0,5,92,2,4,68};
		
		int result = search(arry, 0, arry.length-1, 4);
		System.out.println(result);
	}
	
	
	public static int search(int[] data, int begin, int end, int target){
		if(begin>end){
			return -1;
		}else if(target == data[begin]){
			return begin;
		}else{
			return search(data, begin+1, end, target);
		}	
	}
}

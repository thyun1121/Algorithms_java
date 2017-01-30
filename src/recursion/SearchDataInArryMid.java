package recursion;

// 순차탐색 middle 버전 - inflearn 3회
public class SearchDataInArryMid { 
	
	public static void main(String[] args) {
		int [] arry = {10,0,5,92,2,4,68};
		
		int result = search(arry, 0, arry.length-1, 4);
		System.out.println(result);
	}
	
	
	public static int search(int[] data, int begin, int end, int target){
		if(begin>end){
			return -1;
		}
		int middle = (begin+end)/2;
		if(data[middle] == target){
			return middle;
		}
		
		int index = search(data, begin, middle-1, target);
		
		if(index != -1){
			return index;
		}
		
		return search(data, middle+1, end, target);
	}
}

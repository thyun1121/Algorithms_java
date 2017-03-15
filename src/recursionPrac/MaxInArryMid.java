package recursionPrac;

public class MaxInArryMid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arry = {1, 100, 23, 156, 3};
		int begin =0;
		int end = arry.length-1;
		
		System.out.println(findMaxMid(arry, begin, end));
		
	}
	
	public static int findMaxMid(int[] arry, int begin, int end){
		if(begin == end){
			return arry[begin];
		}		
		
		int mid = (begin+end)/2;	
		
		
		int left  = findMaxMid(arry, begin, mid);
		int right = findMaxMid(arry, mid+1, end);
		
		return Math.max(left, right);
	}
	
	

}

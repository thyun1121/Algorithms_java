package recursion;

public class MaxInArryMid {
	public static void main(String[] args) {
		int[] arry = {3, 1, 100, 432, 200};
		
		int begin = 0;
		int end = arry.length-1;
		
		System.out.println(findMax(arry, begin, end));
	}
	
	public static int findMax(int[] arry, int begin,int end){
		if(begin == end){
			return arry[begin];
		}
		
		int middle = (begin+end) /2;
		int a = findMax(arry, begin, middle);
		int b = findMax(arry, middle+1, end);
		
		return Math.max(a, b);
	}
}

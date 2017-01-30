package recursion;

public class MaxInArry {
	public static void main(String[] args) {
		int[] arry = {3, 1, 100, 432, 200};
		int begin = 0;
		int end = arry.length-1;
		
		System.out.println(findMax(arry, begin, end));
	}
	
	public static int findMax(int[] arry, int begin, int end){
		if(begin == end){
			return arry[begin];
		}else{
			return Math.max(arry[begin], findMax(arry, begin+1, end));
		}
	}
}

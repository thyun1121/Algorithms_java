package recursionPrac;

public class MaxInArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry = {1, 100, 202, 30};
		int begin = 0;
		int end   = arry.length-1;
		
		System.out.println(findMax(arry, begin, end));

	}
	
	public static int findMax(int[] arry, int begin, int end){
		if(begin == end){
			return arry[begin];
		}
		return Math.max(arry[begin], findMax(arry, begin+1, end));
	}
	
	

}

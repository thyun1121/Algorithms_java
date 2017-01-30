package recursionPrac;

public class MaxInArryMid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arry = {100, 20, 300, 1};
		
		int begin = 0;
		int end   = arry.length-1;
		
		System.out.println(findMaxMid(arry, begin, end));
		
	}
	
	public static int findMaxMid(int[] arry, int begin, int end){
		if(begin==end){
			return arry[begin];
		}else{
			int middle = (begin+end)/2;
			int a = findMaxMid(arry, begin,middle );
			int b = findMaxMid(arry, middle+1, end);
			
			return Math.max(a, b);
		}
	}
	
	

}

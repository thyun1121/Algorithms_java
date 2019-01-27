package recursion;

import java.lang.reflect.Array;

public class SumOfArray {
	public static void main(String[] args) {
		int [] num = {1, 3, 5, 7, 9};
		
		int result = sum(0, num);
		System.out.println(result);
	}
	
	public static int sum(int index, int[] num){
		if(index>num.length-1){
			return 0;
		}
		return num[index]+sum(index+1, num);
	}

}

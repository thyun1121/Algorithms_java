package SortPrac;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arry = {29, 10, 14, 37, 13};
		int temp;
		
		for(int i=0; i<arry.length; i++){
			for(int j=0; j<arry.length-1; j++){
				if(arry[j] > arry[j+1]){
					temp = arry[j+1];
					arry[j+1] = arry[j];
					arry[j] = temp;	
				}
			}
			
		}
		
		for(int x : arry){
			System.out.println(x);
		}
		
	}
}

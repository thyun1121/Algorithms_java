package SortPrac;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry = {15,12,13,10,14,11};
		int temp;
		
		for(int i=1; i<arry.length; i++){
			for(int j=i; j>0; j--){
				if(arry[j] < arry[j-1]){
					temp = arry[j-1];
					arry[j-1] = arry[j];
					arry[j] = temp;				
				}
			}			
		}
		
		
		for(int x : arry){
			System.out.println(x);
		}
	}

}

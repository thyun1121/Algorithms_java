package SortPrac;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arry = {29, 10, 14, 37, 13};
		int temp;
		
		for(int i=arry.length-1;i>=0; i-- ){
			for(int j=0; j<i; j++){
				if(arry[i]<arry[j]){
					temp = arry[i];
					arry[i] = arry[j];
					arry[j] = temp;
				}
			}
		}
		
		for(int x : arry){
			System.out.println(x);
		}
	}
}

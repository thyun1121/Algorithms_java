package Sort;

public class BubbleSort {
	public static void main(String[] args) {
		int [] arry = {2, 27, 9, 31, 1};
		int temp;
		
		//for(int j=arry.length-1; j>0; j--){
		for(int j=0; j<arry.length; j++){
			for(int i=0; i<arry.length-1; i++){
				if(arry[i]>arry[i+1]){
					temp = arry[i];
					arry[i] = arry[i+1];
					arry[i+1] = temp;
				}
			}	
		}
		
		
		for(int x : arry){
			System.out.println(x);
		}
	}
}

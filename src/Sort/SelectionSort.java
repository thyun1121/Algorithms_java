package Sort;

public class SelectionSort {
	public static void main(String[] args) {
		int [] arry = {2, 27, 9, 31, 1};
		int temp;
		
		for(int i = arry.length-1; i>0; i--){
			int index = i;
			
			for(int j = 0; j<i; j++){
				if(arry[index] < arry[j]){
					index = j;
				}
			}
			
			temp = arry[i];
			arry[i]=arry[index];
			arry[index] = temp;
			
		}
		
		
		for(int x : arry){
			System.out.print(x);
			System.out.print(",");
		}
		
		
	}
	
}

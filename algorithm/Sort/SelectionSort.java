package Sort;

/**
 * 
 * @author thyun.ahn
 * 
 * 1. select last index value
 * 2. find max value including selected index from first index to before selected index
 * 3. put max value in to selected value's index.
 *
 */

public class SelectionSort {
	public static void main(String[] args) {
		int [] arry = {2, 27, 9, 31, 1};
		int temp;
		for(int i = arry.length-1; i>0; i--){
			int index = i;
			// find max number
			for(int j = 0; j<i; j++){
				if(arry[index] < arry[j]){
					index = j;
				}
			}			
			// put max number in last index and put selected number to max number's before index
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

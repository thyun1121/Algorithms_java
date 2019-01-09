package Review;
/**
 * @author thyun.ahn
 * 
 * Review of SelectionSort.java (Sort)
 */
public class SelectionSort {
	public static void main(String[] args) {
		int [] arry = {2, 27, 9, 31, 1};
		int temp, index;
		
		for(int i=arry.length-1; i>=0; i--){
			index = i;
			
			// find max number index
			for(int j=0; j<i; j++){
				if(arry[j]>arry[index])
					index=j;
			}
			
			// put max number in last index and put selected number to max number's before index
			if(index!=i){
				temp = arry[i];
				arry[i] = arry[index];
				arry[index] = temp;
			}
		}
		
		for(int i: arry)
			System.out.println(i);
		
		
	}
	
}

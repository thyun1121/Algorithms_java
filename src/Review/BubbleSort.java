package Review;
/**
 * @author thyun.ahn
 * 
 * Review of BubbleSort.java (Sort)
 */
public class BubbleSort {
	public static void main(String[] args) {
		int [] arry = {2, 27, 9, 31, 1};
		int temp;
		
		for(int i=0; i<arry.length; i++){
			for(int j=0; j<arry.length-1; j++){
				if(arry[j]>arry[j+1]){
					temp = arry[j];
					arry[j] = arry[j+1];
					arry[j+1] = temp;
				}
			}
		}
		
		for(int i: arry){
			System.out.println(i);
		}
		
	}
}

package Sort;



public class InsertionSort {
	
	public static void main(String[] args) {
		int [] arry = {2, 27, 9, 31, 1};
		int i, j, temp;
		
		for(i=1; i<arry.length; i++){
			j=i; 
			temp = arry[i];
			
			
			while(j>0 && arry[j-1] > temp){
				arry[j]=arry[j-1];	
				j--;
			}
			
			/*for(j=i; j>0; j--){
				if(arry[j-1]> temp){
					arry[j]=arry[j-1];					
				}
			}*/
			arry[j]=temp;
		}
		
		for(int x:arry){
			System.out.println(x);
		}
	}
}

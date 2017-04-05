package Sort;


/* 주의!!
 * 1. temp를 사용하지 않고, 비교와 대입을 arry[i]로하면 값이 변경되기 때문에 제대로된 결과를 얻을 수 없다.
 * 2. #16에서 j=i-1로선언해버리면 while 문에서 j>=0으로 해야하는데 j--때문에 -1로 되어버려 배열 범위를 벗어나버리게 된다.
 * 3. for문을 사용하게 되면j--도 같이 실행되기 때문에 원하는 결과를 얻을 수 없다.
 * */

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

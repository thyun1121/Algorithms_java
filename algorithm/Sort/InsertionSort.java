package Sort;

/**
 * 
 * @author thyun.ahn
 * 
 * 1. 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교 하여, 자신의 위치를 찾아 삽입함으로써 정렬을 완성하는 알고리즘.
 * 2. 두번째 index 부터 시작.
 *
 */
public class InsertionSort {
	
	public static void main(String[] args) {
		int [] arry = {2, 27, 9, 31, 1};
		
		for(int i=1; i<arry.length; i++){
			int j=i-1;
			int temp = arry[i];
			while(j>=0 && arry[j]>temp){
				arry[j+1] = arry[j];
				j--;
			}
			arry[j+1] = temp;		// 선택된 index의 값(temp)을 temp보다 작은 값의 index+1 자리에 삽입한다. 
		}
		
		for(int i : arry){
			System.out.println(i);
		}
	}
}

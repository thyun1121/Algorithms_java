package recursion;

import java.util.Arrays;

public class PowerSet {

	private static char data[] = {'a','b'};
	private static int n = data.length;
	private static boolean include[] = new boolean [n];
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		powerSet(0, "main");

	}
	
	public static void powerSet(int k, String caller){
		System.out.println(caller);
		System.out.println("===> "+k);
		
		System.out.println(Arrays.toString(include));
		
		if(k==n){
			for(int i=0; i<k; i++){
				if(include[i]){
					System.out.print(data[i]+" ");
				}
			}
			System.out.println();
			System.out.println("RETURN!!!!!");
			return ;
		}
		
		//집합 S에서 k(맨 첫번째 원소)를 포함하지 않는 경우
		include[k] = false;	
		System.out.println("::::first:::: "+k);
		powerSet(k+1, "first");  //집합p에서 true인 것과 집합 S를 나열한다.
		
		//집합 S에서 k(맨 첫번째 원소)를 포함하는 경우
		include[k] = true;
		System.out.println("::::second:::: "+k);
		powerSet(k+1, "second"); //집합 P 에서 true +S의 첫번째 원소 + 집합 S 나열
	}

}

package recursion;

import java.util.Arrays;

public class PowerSet {

	private static char data[] = {'a','b'};
	private static int n = data.length;
	private static boolean include[] = new boolean [n];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		powerSet(0);

	}
	
	public static void powerSet(int k){
		//System.out.println(Arrays.toString(include));
		//System.out.println("===> "+n);
		if(k==n){
			for(int i=0; i<k; i++){
				if(include[i]){
					System.out.print(data[i]+" ");
				}
			}
			System.out.println();
			return ;
		}
		include[k] = false;
		powerSet(k+1);
		include[k] = true;
		powerSet(k+1);
	}

}

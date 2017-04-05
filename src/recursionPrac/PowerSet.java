package recursionPrac;

public class PowerSet {
	
	private static char[] data = {'a', 'b', 'c'};
	private static int n = data.length;	
	private static boolean[] include = new boolean[n];
	
	
	public static void main(String[] args) {
		powerset(0);
		
	}
	
	
	public static void powerset(int k){
		if(k == n){
			
			for(int i=0; i<k; i++){
				if(include[i]){
					System.out.print(data[i]+" ");
				}					
			}
			
			System.out.println();
			return;
		}
		
		include[k]= false;
		powerset(k+1);
		
		include[k]= true;
		powerset(k+1);
	}	
}
	
	
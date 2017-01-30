package recursionPrac;

public class PowerSet {
	
	private static char [] S = {'a', 'b', 'c'};
	private static int n = S.length;
	private static boolean [] P = new boolean [n];
	
	public static void main(String[] args) {
		powerSet(0);
	}
	
	
	public static void powerSet(int k){
		if(k==n){
			for(int i=0; i<k; i++){
				if(P[i]){
					System.out.print(S[i]);
				}
			}
			System.out.println();
		}else{
			P[k] = false;
			powerSet(k+1);
			P[k] = true;
			powerSet(k+1);
		}
	}
	
	
}

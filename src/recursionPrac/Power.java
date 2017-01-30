package recursionPrac;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powerMultiple(3,5));
	}
	
	public static int powerMultiple(int x, int n){
		if(n==0){
			return 1;
		}
		return x*powerMultiple(x, n-1);
	}
	
	

}

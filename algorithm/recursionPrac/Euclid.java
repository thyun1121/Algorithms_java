package recursionPrac;

public class Euclid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 30;
		int b = 12;
		
		System.out.println(gcb(a, b));
		
	}
	
	public static int gcb(int a, int b){
		if(a%b == 0){
			return b;
		}else{
			if(a<b){
				int temp = b;
				b=a;
				a=temp;
			}
			
			return gcb(b, a%b);
		}
	}
	
	
	
	

}

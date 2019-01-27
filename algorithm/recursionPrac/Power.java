package recursionPrac;

public class Power {

	public static void main(String[] args) {
		
		System.out.println("Used Memory : " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
		String str = "arade";
		int x = 3;
		System.out.println("Used Memory : " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
		int y = 5;
		
		System.out.println(power(x, y));
		
		System.out.println("Total Memory : " + Runtime.getRuntime().totalMemory()); //현재 allocate된 메모리 사용
		System.out.println("Free Memory : " + Runtime.getRuntime().freeMemory()); 	//allocate된 메모리 중 사용가능한 메모
		System.out.println("Used Memory : " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
	}
	
	
	public static int power(int x, int n){
		if(n==0){
			return 1;
		}
		return x* power(x, n-1);
	}
	
	

}

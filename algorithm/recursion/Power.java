package recursion;
//n의 x제곱 구하기

public class Power {
	public static void main(String[] args) {
		int result = multiple(3, 4);
		System.out.println(result);
	}
	
	public static int multiple(int n, int x){
		if (x==0){
			return 1;
		}else{
			return n*multiple(n, x-1);
		}
	}
}

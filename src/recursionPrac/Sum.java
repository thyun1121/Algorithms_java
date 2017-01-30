package recursionPrac;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		System.out.println(Sum(num));
	}
	
	public static int Sum(int num){
		if(num ==0){
			return 0;
		}
		return num+Sum(num-1);
	}

}

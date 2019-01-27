package recursion;
//10진수 -> 2진수로!
public class DeciToBin {
	public static void main(String[] args) {
		int num = 36;
		change(num);
	}
	
	public static void change(int num){
		if(num<2){
			System.out.print(num);
		}else{
			change(num/2);
			System.out.print(num%2);
		}		
	}
}

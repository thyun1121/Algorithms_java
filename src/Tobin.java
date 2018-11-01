import java.util.Scanner;

public class Tobin {

	public static void main(String[] args) {
		int[] arry = {0,1};
		for(int i=0; i<arry.length; i++){
			for(int j=0; j<arry.length; j++){
				System.out.println(arry[i]+""+arry[j]);
			}
		}
		
		int index = 0;
		int cnt = 2;
		
		recursive(arry, index,cnt);
	}
	
	public static void recursive(int[] arry, int index, int cnt){
		if(index==arry.length)
			return;
		
		for(int i=index; i<arry.length; i++){
			System.out.print(arry[i]);
			recursive(arry, index+1, 0);
		}
	}
}

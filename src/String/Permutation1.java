package String;

import java.util.concurrent.SynchronousQueue;

public class Permutation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "thyunthedavid";
		String str2 = "davidthethyun";
		
		if(permutation(str1, str2)){
			System.out.println("permutation relationship!");
		}else{
			System.out.println("not permutation relationship");
		}

	}
	
	public static boolean permutation(String str1, String str2){
		if(str1.length() != str2.length())
			return false;
		return sort(str1).equals(sort(str2));
	}
	
	public static String sort(String str){
		char[] c = str.toCharArray();
		java.util.Arrays.sort(c);
		return new String(c);
	}

}

package recursion;

public class StrLength {
	public static void main(String[] args) {
		String str = "thyunAhn";
		int result = calLength(str);
		System.out.println(result);
	}
	
	public static int calLength(String str){
		if(str.length()==0){
			return 0;
		}
		
		return 1+calLength(str.substring(1));
	}

}

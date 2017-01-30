package recursion;

public class strPrint {
	public static void main(String[] args) {
		String str = "thyunAhn";
		print(str);
	}
	
	public static String print(String str){
		if(str.length()==0)
			return "";
		System.out.print(str.charAt(0));
		return print(str.substring(1));
	}
}

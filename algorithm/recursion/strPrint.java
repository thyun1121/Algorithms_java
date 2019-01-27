package recursion;

public class strPrint {
	public static void main(String[] args) {
		print("thyunAhn");
	}
	
	public static String print(String str){
		if(str.length()==0){
			return "";
		}else{
			System.out.print(str.charAt(0));
			return print(str.substring(1));
		}
	}
	
}

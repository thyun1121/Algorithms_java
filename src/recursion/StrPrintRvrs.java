package recursion;

public class StrPrintRvrs {
	public static void main(String[] args) {
		print("thyunAhn");
	}
	
	public static void print(String str){
		if(str.length()==0){
			return;
		}
		
		print(str.substring(1));
		System.out.print(str.charAt(0));
	}
}

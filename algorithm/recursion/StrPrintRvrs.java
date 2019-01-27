package recursion;

public class StrPrintRvrs {
	public static void main(String[] args) {
		System.out.println(print("thyunAhn"));
	}
	
	public static String print(String str){
		if(str.length()==0){
			return "";
		}else{
			String rtn = print(str.substring(1));
			return rtn+str.charAt(0);
		}
	}
}

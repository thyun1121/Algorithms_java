package recursionPrac;

public class strPrint {

	public static void main(String[] args) {
		String str = "thyun.ahn";
		printStr(str);
	}
	
	public static String printStr(String str){
		if(str.length()==0){
			return "";
		}else{
			System.out.print(str.charAt(0));
			return printStr(str.substring(1));
		}
	}
}

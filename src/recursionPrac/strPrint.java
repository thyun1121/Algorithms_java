package recursionPrac;

public class strPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "programming";
		System.out.println(printStr(str));
	}
	
	public static String printStr(String str){
		if(str.length()==0){
			return "";
		}else{
			return str.charAt(0)+printStr(str.substring(1));
		}		
	}
}

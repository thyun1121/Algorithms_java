package recursionPrac;
//막혔음. 고민 많이 했음. Prac ver.(return type)으로 할 것!
public class strPrintRvrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "programming";
		
		System.out.print(printStr(str));
	}
	
	public static String printStr(String str){
		
		if(str.length()==0){
			return "";
		}
		String result = printStr(str.substring(1));		
		return result+str.charAt(0);
	}

}

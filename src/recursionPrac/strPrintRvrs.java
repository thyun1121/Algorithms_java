package recursionPrac;
//막혔음. 고민 많이 했음. Prac ver.(return type)으로 할 것!
public class strPrintRvrs {

	public static void main(String[] args) {
		String str = "thyun.ahn";
		printRverse(str);
	}
	
	public static void printRverse(String str){
		if(str.length()==0){
			return;
		}
		printRverse(str.substring(1));
		System.out.print(str.charAt(0));
	}
	
	
		
		

}

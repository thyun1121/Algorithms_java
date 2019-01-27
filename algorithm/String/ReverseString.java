package String;

public class ReverseString {

	public static void main(String[] args) {
		//reverse String
		
		String str = "Hello! Thyun.ahn";
		reverseStringByCharAt(str);
		System.out.println();
		reverseStringByBuffer(str);
	}
	
	public static void reverseStringByCharAt(String str){
		for(int i=str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i));
		}
	}
	
	public static void reverseStringByBuffer(String str){
		StringBuffer sbf = new StringBuffer();
		sbf.append(str);
		System.out.println(sbf.reverse());
	}
}

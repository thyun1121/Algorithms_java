package recursionPrac;

public class strLength {

	public static void main(String[] args) {
		String str = "thyun.Ahn";
		System.out.println(calculateLength(str));
	}
	
	public static int calculateLength(String str){
		if(str.length() == 0){
			return 0;
		}else{
			return 1+calculateLength(str.substring(1));
		}
	}

}

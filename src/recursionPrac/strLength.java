package recursionPrac;

public class strLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "programming";
		System.out.println(callLength(str));
	}
	
	public static int callLength(String str){
		if (str.length()==0){
			return 0;
		}else{
			return 1+callLength(str.substring(1));
		}
		
	}

}

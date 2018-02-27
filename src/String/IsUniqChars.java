package String;

public class IsUniqChars {
	public static void main(String[] args) {
		String str = "qazwsxedcrfvp";
		if(isUniqChars(str))
			System.out.println("unique");
		else
			System.out.println("not unique");
	}
	
	public static boolean isUniqChars(String str){
		if(str.length()>256)	return false;
		
		boolean[] bl = new boolean[256];
		for(int i=0; i<str.length(); i++){
			int val = str.charAt(i);
			if(bl[val])	return false;
			bl[val] = true;
		}
		return true;
	}

}

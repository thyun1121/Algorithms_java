package String;

public class Permutation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "thunthedavidh";
		String str2 = "davidthethhun";
		if(permutation(str1, str2)){
			System.out.println("permutation relationship!");
		}else{
			System.out.println("not permutation relationship");
		}

	}
	
	public static boolean permutation(String str1, String str2){
		if(str1.length()!=str2.length()){
			return false;
		}
		
		int[] letters = new int[256];
		
		char[] chr = str1.toCharArray();
		for(char c : chr){
			letters[c]++;
		}
		
		for(int i=0; i<str2.length(); i++){
			int idx = str2.charAt(i);
			letters[idx]--;
			if(letters[idx] <0)
				return false;
		}
		
		return true;
	}

}

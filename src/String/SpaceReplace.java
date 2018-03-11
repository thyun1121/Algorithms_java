package String;

public class SpaceReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "thyun ah n";
		
		replaceSpaces1(str.toCharArray(), str.length());	// replace from behind
		replaceSpaces2(str);	// using StringBuilder
		replaceSpaces3(str);	// using replaceAll
	}
	
	public static void replaceSpaces1(char[] chr, int length){
		int spaceCnt=0;
		
		for(int i=0; i<chr.length; i++){
			if(chr[i] == ' '){
				spaceCnt++;
			}
		}
		
		int idx = length+spaceCnt*2;
		
		char[] newChar = new char[idx];
		
		for(int j=length-1; j>=0; j--){
			if(chr[j] == ' '){
				newChar[idx-1]='0';
				newChar[idx-2]='2';
				newChar[idx-3]='%';
				idx-=3;
			}else{
				newChar[idx-1]=chr[j];
				idx--;
			}
		}
		
		System.out.println(new String(newChar));
	}
	
	public static void replaceSpaces2(String str){
		String[] words = str.split(" ");
		StringBuilder stb = new StringBuilder(words[0]);
		
		for(int i=1; i<words.length; i++){
			stb.append("%20");
			stb.append(words[i]);
		}
		
		System.out.println(stb);
		
	}
	
	public static void replaceSpaces3(String str){
		System.out.println(str.replace(" ", "%20"));
	}

}

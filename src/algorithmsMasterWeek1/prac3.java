package algorithmsMasterWeek1;
//입력받은 문자열(소문자만)에서 최초로 반복되는 문자를 찾으세요 시간복잡도는 O(N)

//입력 2 banana ilovealgorithm
//출력 a l
public class prac3 {
	public static void main(String[] args) {
		String str = "banana";
		
		System.out.println(getChar(str));
	}
	
	public static String getChar(String str){
		boolean[] chr = new boolean[256]; 
		char[] newch = str.toCharArray();
		String rtn="";
		
		for(char c : newch){			
			if(chr[c] == false){
				chr[c] = true;
			}else{
				rtn =""+c;
				break;
			}
		}
		
		return rtn;
	}
	
	
}

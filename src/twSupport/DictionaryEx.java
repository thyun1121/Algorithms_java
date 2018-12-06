package twSupport;

import java.util.Scanner;

class Dictionary {
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	
	public static String korToEng(String word){
		int index=-1;
		for(int i=0; i<kor.length; i++){
			if(kor[i].equals(word)){
				index=i;
				break;
			}
		}
		
		if(index>-1)
			return word+"은/는 "+eng[index];
		else
			return word+"은/는 저의 사전에 없습니다.";
	}
}

public class DictionaryEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input="";
		System.out.println("한영 단어 검색프로그램입니다.");
		while(true){
			System.out.print("한글단어: ");
			input=sc.next();
			if("그만".equals(input)) break;
			System.out.println(Dictionary.korToEng(input));
		}

	}

}

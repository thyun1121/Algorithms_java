package String;

public class AdjacentReplace {
	public static void main(String[] args) {
		String s = "AAAAAA";
		System.out.println(solution(s)); 	//O(n^2)
		System.out.println(solutionForN(s));
	}
	
	public static String solution (String s){
		String[] arry = {"AB", "BA", "CD", "DC"};
		int i=0;
		while(i<arry.length){
			if(s.indexOf(arry[i])>=0){
				s=s.replace(arry[i], "");
				i=0;
			}else	i++;			
		}
		return s;
	}
	
	public static String solutionForN(String s){
		int i=0;
		
		while(true){
			if(s.length()==0 || i>=s.length()-1)	return s;
			if(isAdjacent(s.charAt(i), s.charAt(i+1))){
				s=s.substring(0,i)+s.substring(i+2);
				i=0;
			}else{
				i++;
			}
		}
	}
	
	public static Boolean isAdjacent(char first, char second){
		if(first>second){
			char temp = first;
			first = second;
			second = temp;
		}
		
		return (first=='A'||first=='C') && ((int)second-(int)first == 1);
	}
}

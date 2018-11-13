import java.util.ArrayList;

public class RecursionPattern {
	public static String[] useStr = {"0","1","2"};
	public static ArrayList<String> al= new ArrayList<String>();
	public static String[] arry = new String[4];
	public static String str="";
	
	public static int N = 4;
	
	
	public static void main(String[] args) {
		
		//arryListRecursion();
		//arryRecursion(0);
		stringRecursion();
	}
	
	public static void arryListRecursion(){
		if(al.size()==N){
			for(String str : al)
				System.out.print(str+" ");
			System.out.println();
			return;
		}
		
		for(int i=0; i<useStr.length; i++){
			al.add(useStr[i]);
			arryListRecursion();
			al.remove(al.size()-1);
		}			
	}
	
	
	public static void arryRecursion(int idx){
		if(idx==N){
			for(String str : arry)
				System.out.print(str+" ");
			System.out.println();
			return;
		}			
		
		for(int i=0; i<useStr.length; i++){
			arry[idx]=useStr[i];
			arryRecursion(idx+1);
		}
	}
	
	public static void stringRecursion(){
		if(str.length()==N){
			System.out.println(str);
			return;
		}			
		
		for(int i=0; i<useStr.length; i++){
			str+=useStr[i];
			stringRecursion();
			str=str.substring(0, str.length()-1);
			
		}
	}

}

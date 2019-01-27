package Review;

import java.util.ArrayList;

/**
 * 
 * @author thyun.ahn
 * 
 * Review of RecursionPattern.java
 *
 */
public class BruteForcePattern {
	public static int N = 4;
	public static String[] useStr = {"0","1","2"};
	
	public static ArrayList<String> al= new ArrayList<String>();
	public static String[] arry = new String[4];
	public static String strResult = "";
	
	
	public static void main(String[] args){
		//arryListRecursion();
		//arryRecursion(0);
		strRecursion();
	}
	
	public static void strRecursion(){
		if(strResult.length() == N){
			System.out.println(strResult);
			return;
		}
		for(int i=0; i<useStr.length; i++){
			strResult+=useStr[i];
			strRecursion();
			strResult = strResult.substring(0, strResult.length()-1);
		}
	}
	
	
	public static void arryRecursion(int index){
		if(index == N){
			for(String str : arry){
				System.out.print(str);
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<useStr.length; i++){
			arry[index] = useStr[i];
			arryRecursion(index+1); 
		}
	}
	
	
	public static void arryListRecursion(){		
		if(al.size()==N){
			for(String str: al)
				System.out.print(str);
			System.out.println();
			return;
		}
		for(int i=0; i<useStr.length; i++){
			al.add(useStr[i]);
			arryListRecursion();
			al.remove(al.size()-1);
		}
	}
}

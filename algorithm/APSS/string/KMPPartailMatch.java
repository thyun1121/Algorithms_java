package APSS.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KMPPartailMatch {
	
	private ArrayList<Integer> getPartialMatch(String str){
		ArrayList<Integer> pi = setList(str.length(), 0);	//pi 문자열 길이만큼 0으로 초기화.
		int strLength = str.length();	//문자열 길이. 
		int begin=1, matched=0;			//begin: 비교 시작위치, matched: 일치한 마지막 위치.
		
		while(begin+matched<strLength){
			if(str.charAt(begin+matched) == str.charAt(matched)){	//0부터 비교하여 일치하면 matched update
				matched++;
				pi.set(matched+begin-1, matched);
			}else{
				if(matched==0)			//matched=0인 경우에는 다음칸에서부터 계속 비교한다.
					begin++;
				else{
					begin+=matched-pi.get(matched-1);
					matched = pi.get(matched-1);
				}
			}
		}
		return pi;
	}
	
	public ArrayList<Integer> setList(int length, int initValue){
		Integer[] arry = new Integer[length];
		ArrayList<Integer> arryList = new ArrayList<Integer>(Arrays.asList(arry));
		Collections.fill(arryList, initValue);
		return arryList;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KMPPartailMatch kp = new KMPPartailMatch();
		String str = "aabaabac";
		ArrayList<Integer> al = kp.getPartialMatch(str);
		for(Integer i : al){
			System.out.println(i);
		}
	}

}

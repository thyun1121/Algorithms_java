package etcPrac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Pair {
	int a;
	int b;
	
	Pair(int x, int y){
		this.a = x;
		this.b = y;
	}
}

public class FindCubePair {
	public static void main(String[] args) {
		int n = 3;
		int c, d;
	
		Map<Integer, List<Pair>> hashMap = new HashMap<Integer,List<Pair>>();
		
		for(c=1; c<=3; c++){
			for(d=1; d<=3; d++){
				List<Pair> pairList = new ArrayList<Pair>();
				int result = (int)(Math.pow(c, 3)+Math.pow(d, 3));
				hashMap.put(result, pairList);
				hashMap.get(result).add(new Pair(c,d));
			}
		}
		
		for(Map.Entry<Integer, List<Pair>> entry : hashMap.entrySet()){
			for(Pair pair1 : entry.getValue()){
				for(Pair pair2 : entry.getValue()){
					System.out.println(pair1.a+" "+pair1.b+" : "+pair2.a+" "+pair2.b);
				}
			}
		}
	}
	
}

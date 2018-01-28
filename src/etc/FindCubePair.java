package etc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//from 1 to 1000, a^3+b^3=c^3+b^3, a?b?c?d?

class Pair{
	int a;
	int b;
	
	Pair(int x, int y){
		this.a = x;
		this.b = y;
	}
}

public class FindCubePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, ArrayList<Pair>> hashMap = new HashMap<>();		
		
		int n = 3;
		int result = 0;
		
		for(int c=1; c<=n; c++){
			for(int d=1; d<=n; d++){
				result = (int) (Math.pow(c,3)+Math.pow(d,3));
				ArrayList<Pair> list = new ArrayList<>();
				hashMap.put(result, list);
				hashMap.get(result).add(new Pair(c,d));
				
				//list.add(new Pair(c,d));
				//hashMap.put(result, list);
			}
		}
		
		for(Map.Entry<Integer, ArrayList<Pair>> entry : hashMap.entrySet()){
			//System.out.println(entry.getKey()+" "+entry.getValue().get(0).a+" "+entry.getValue().get(0).b);
			for(Pair pair1 : entry.getValue()){
				for(Pair pair2 :entry.getValue() ){
					System.out.println(pair1.a+" "+pair1.b+" "+pair2.a+" "+pair2.b);
				}
			}
		}
		
		
		
		
		/*HashMap<Long, ArrayList<Pair>> hashMap = new HashMap<>();
        int n = 2;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                long sum = (long) (Math.pow(i, 3) + Math.pow(j, 3));

                if(hashMap.containsKey(sum)) {
                    List<Pair> list = hashMap.get(sum);
                    for(Pair p : list) {
                        System.out.println(i + " " + j + " " + p.a + " " + p.b);
                    }
                } else {
                    ArrayList<Pair> list = new ArrayList<>();
                    hashMap.put(sum, list);
                }

                hashMap.get(sum).add(new Pair(i, j));
            }
        }*/

	}

}

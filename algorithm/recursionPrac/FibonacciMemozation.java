package recursionPrac;

import java.util.HashMap;
import java.util.Map;

//f0 = 0
//f1 = 1
//fn = fn-1 + fn-2  (n>1)

//0112358
public class FibonacciMemozation {

	public static void main(String[] args) {
		int num = 6;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		System.out.println(fibonacci(num, map));
	}
	
	public static int fibonacci(int num, Map<Integer, Integer> map){
		if(num<2){
			return num;
		}else if(map.containsKey(num)){
			return map.get(num);
		}else{
			int result  = fibonacci(num-1, map)+fibonacci(num-2, map);
			map.put(num, result);
			return result;
		}
	}
}

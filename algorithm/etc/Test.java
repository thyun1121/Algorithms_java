package etc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		List testList = new ArrayList();
		
		testList.add(0, 1);
		testList.add(0, 1);
		System.out.println(testList);
		
		int[] arryTest = new int [2];
		arryTest[0] = 1;
		arryTest[1] = 2;
		System.out.println(arryTest[0]);
		
		Map<String, List> mapTest = new HashMap();
		mapTest.put("0", testList);
		mapTest.put("1", testList);
		System.out.println(mapTest.get("0"));
		
		for(Map.Entry<String, List> entry : mapTest.entrySet()){
			System.out.println(entry.getValue());
			
		}
	}

}

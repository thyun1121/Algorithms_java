package recursionPrac;

public class BinarySearch {

	public static void main(String[] args) {
		String []strArray = {"a", "d", "g", "l", "x"};
		
		String target = "l";
		int begin = 0;
		int last  = strArray.length-1;
		
		System.out.println(getBinarySearch(strArray, begin, last, target));
	}
	
	public static int getBinarySearch(String [] strArray, int begin, int last, String target){
		if(begin>last){
			return -1;
		}
		
		int middle = (begin+last)/2;
		
		if(strArray[middle] == target){
			return middle;
		}else{
			int cmp = target.compareTo(strArray[middle]);
			if(cmp == 0){
				return middle;
			}else if(cmp<0){
				return getBinarySearch(strArray, begin, middle, target);
			}else{
				 return getBinarySearch(strArray, middle+1, last, target);
			}
		}
	}
	

}

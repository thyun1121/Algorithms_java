package recursionPrac;

public class BinarySearch {

	public static void main(String[] args) {
	
		String [] arry = {"a", "b", "c", "d", "e"};
		
		int begin = 0;
		int end = arry.length-1;
		String target = "d";
		
		System.out.println(execBinarySearch(arry, begin, end, target));
	}
	
	public static int execBinarySearch(String[] arry, int begin, int end, String target){
		if(begin>end){
			return -1;
		}else{
			int middle = (begin+end)/2;
			
			if(target == arry[middle]){
				return middle;
			}else{
				int cmp = target.compareTo(arry[middle]);
				if(cmp == 0){
					return middle;
				}else if(cmp < 0){
					return execBinarySearch(arry, begin, middle, target);
				}else if(cmp > 0){
					return execBinarySearch(arry, middle+1, end, target);
				}
			}
		}
		return 0;
	}
	
	
}

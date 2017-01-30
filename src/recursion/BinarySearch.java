package recursion;
//이진검색은 크기순으로 배열에 정렬되어있다는 전제하에 시작한다.
public class BinarySearch {
	public static void main(String[] args) {
		String[] arry = {"a", "d", "g", "l", "x"};
		int begin = 0;
		int end = arry.length-1;
		String target = "l";
		System.out.println(binarySearch(arry, begin, end, target));
	}
	
	public static int binarySearch(String[] arry, int begin, int end, String target){
		if(begin > end){
			return -1;
		}
		
		int middle = (begin+end)/2;
		
		if(arry[middle]==target){
			return middle;
		}
		
		int cmpResult = target.compareTo(arry[middle]);
		
		if (cmpResult ==0){
			return middle;
		}else if(cmpResult < 0 ){
			return binarySearch(arry, begin, middle-1, target);
		}else{
			return binarySearch(arry, middle+1, end, target);
		}
		
	}

}

package recursionPrac;
// 시간 많이 걸림.
public class SearchDataInArryMid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arry = {4, 67, 10, 38, 36, 60, 28};
		int begin = 0;
		int last = arry.length-1;
		int target = 28;
		
		System.out.println(searchData(arry, begin, last, target));
	}
	
	public static int searchData(int [] arry, int begin, int last, int target){
		if(begin>last){
			return -1;
		}else{
			int middle = (begin+last)/2;
			if(target == arry[middle]){
				return middle;
			}else{
				int result = searchData(arry, begin, middle-1, target);
				if(result != -1){
					return result;
				}else{
					return searchData(arry, middle+1, last, target);
				}
			}
		}	
	}
}

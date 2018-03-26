package algorithmsMasterWeek1;

public class Prac4 {
	
	public static void main(String[] args) {
		int[]  arry = {2,2,-2,2,2};
		
		int allSum=0;
		for(int n : arry){
			allSum+=n;
		}
		//System.out.println(allSum);
		System.out.println(Math.min(Math.abs(allSum), execute(arry, 0, arry.length-1)));
	}
	
	public static int execute(int[] arry, int begin, int end){		
		if(begin == end)
			return arry[begin];
		
		int left = 1000000;
		int right = 1000000;
		int mid = (begin+end)/2;
		int sum=0;
		
		for(int i=mid; i>=begin; i--){
			sum += arry[i];
			if(left>Math.abs(sum)){
				left = sum;
			}
		}
		
		sum=0;
		
		for(int j=mid+1; j<=end; j++){
			sum += arry[j];
			if(right>Math.abs(sum)){
				right = sum;
			}
		}		
		int single =Math.min(Math.abs(execute(arry, begin, mid)), Math.abs(execute(arry, mid+1, end)));
		
		if(Math.abs(execute(arry, begin, mid)) < Math.abs(execute(arry, mid+1, end))){
			single = execute(arry, begin, mid);
		}else{
			single =execute(arry, mid+1, end);
		}
		
		return Math.min(Math.abs(left+right),Math.abs(single) );		
	}

}

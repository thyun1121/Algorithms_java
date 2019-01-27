package recursionPrac;

public class SumOfArray {

	public static void main(String[] args) {
		int[] arry = {1,3,5,7,9};
		int index = 0;
		
		System.out.println(sumOfArry(arry, index));
	}
	
	public static int sumOfArry(int[] arry, int index){
		if(index==arry.length){
			return 0;
		}else{
			return arry[index]+sumOfArry(arry, index+1);
		}
	}
	

}

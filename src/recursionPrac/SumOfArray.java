package recursionPrac;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arry = {1, 4, 6, 7, 8};
		int index = 0;
		System.out.println(sumOfArray(arry, index));
	}
	
	public static int sumOfArray(int [] arry, int index){
		if(index>=arry.length){
			return 0;
		}
		return arry[index]+sumOfArray(arry, index+1);
	}

}

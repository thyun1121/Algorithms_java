package APSS.partialSum;

public class PartialSum2Arry {
	private int[][] arry = {{0,1,1,0,0,1}, {0,0,0,0,0,1}, {1,0,1,0,1,1}};;
	private int[][] pSum;

	//부분합 구하기.
	private void setPartialSumArry(){
		pSum = new int[3][6];
		pSum[0][0] = arry[0][0];
		for(int i=1; i<3; i++)	pSum[i][0] = pSum[i-1][0]+arry[i][0];
		for(int i=1; i<6; i++)	pSum[0][i] = pSum[0][i-1]+arry[0][i];

		for(int i=1; i<3; i++){
			for(int j=1; j<6; j++){
				pSum[i][j] = pSum[i][j-1] + pSum[i-1][j] - pSum[i-1][j-1] + arry[i][j];
			}
		}
	}

	//부분합 배열 출력.
	private void printPartialSumArry(){
		for(int i=0; i<3; i++){
			for(int j=0; j<6; j++){
				System.out.print(pSum[i][j]);
			}
			System.out.println();
		}
	}
	
	//1,1 ~ 2,2 (0부터 시작.)
	private int getPartialSum(int x1, int y1, int x2, int y2){
		return pSum[x2][y2]-pSum[x1-1][y2]-pSum[x2][y1-1]+pSum[x1-1][y1-1];
	}
	
	public static void main(String[] args) {

		PartialSum2Arry ps = new PartialSum2Arry();

		//부분합 set
		ps.setPartialSumArry();

		//부분합 배열 출력
		ps.printPartialSumArry();
		
		//(1,1) ~ (2,2)까지의 합.
		System.out.println(ps.getPartialSum(1,1,2,2));
	}
}

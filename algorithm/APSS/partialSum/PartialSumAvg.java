package APSS.partialSum;


public class PartialSumAvg {

	//2등부터 5등까지 점수 평균??
	public static void main(String[] args) {
		int[] scores = {100, 97, 86, 79, 66, 52, 49, 42, 41};
		int start = 1, end = 4;
		
		long startTime = System.currentTimeMillis();
		
		//==================== 평소방식.
		for(int i=0; i<30000; i++)
			System.out.println(originAvg(scores, start, end));

		//==================== 부분합.
		int[] pSum = new int[scores.length];
		
		for(int i=0; i<scores.length; i++){
			if(i==0)	pSum[0] = scores[0];
			else		pSum[i] = pSum[i-1]+scores[i];
		}
		
		for(int i=0; i<30000; i++)
			System.out.println(partialSumAvg(scores, pSum, start, end));

		
		long endTime = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
		System.out.println( "실행 시간 : " + ( endTime - startTime )/1000.0+"초"); //실행 시간 계산 및 출력
	}

	public static int originAvg(int[] scores, int start, int end){
		int sum = 0;
		for(int i=start; i<=end; i++)	sum+=scores[i];
		return sum/(end-start+1);
	}

	public static int partialSumAvg(int[] scores, int[] pSum, int start, int end){
		return (pSum[end]-pSum[start-1])/(end-start+1);
	}
}

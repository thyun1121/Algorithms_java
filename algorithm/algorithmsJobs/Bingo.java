package algorithmsJobs;
import java.util.Scanner;
/*
 * 이문제는 내게 좀 어려웠다.
   1. 일일히 0을 넣고, 대각선/가로/세로 빙고 갯수를 어떻게 하면 쉽게 찾을 수 있을지 고민을 많이 했다. 하지만 딱히 떠오르지 않았다.
   2. scanner의 hasNextInt()를 처음 써봐서 디버깅 및 구현에 살짝 헤맸다.
   
   다음 복습시 할일.
   1. 다시 if 또는 for문의 갯수를 생각하지말고 우선 다시 풀어보자.
   2. 코드를 더 줄일 수 있는 방법이 있거나, 조금 더 스마트하게 풀 수 있는 방법을 찾아보자.
   		- http://grayt.tistory.com/59
   		- http://paintime.tistory.com/entry/JUNGOL-%EC%8B%A4%EB%A0%A5%ED%82%A4%EC%9A%B0%EA%B8%B0-1031-%EB%B9%99%EA%B3%A0
 */
public class Bingo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arryBingo = new int[5][5];
		
		int calledCnt=0;
		
		
		//빙고판 입력
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				arryBingo[i][j] = sc.nextInt();
			}
		}
		
		int calledNo;
		//사회자가 부르는 값 입력 및 비교
		while(sc.hasNextInt()){
			calledNo = sc.nextInt ();
			calledCnt++;
			
			//사회자가 부르는 값에 해당되는 곳을 0으로 변경.
			for(int i=0; i<5; i++){
				for(int j=0; j<5; j++){
					if(arryBingo[i][j]==calledNo){
						arryBingo[i][j]=0;
						break;
					}
				}
			}		
			
			int upLeftDiagCnt=0;
			int upRightDiagCnt=0;
			int line=0;
			
			//빙고 3개 이상 체크.
			for(int i=0; i<5; i++){
				int rowZeroCnt=0;
				int colZeroCnt=0;
				for(int j=0; j<5; j++){
					//가로체크.
					if(arryBingo[i][j]==0)	rowZeroCnt++;
					if(arryBingo[j][i]==0)	colZeroCnt++;
				}
				
				//좌상우하 대각선체크.
				if(arryBingo[i][i]==0)	upLeftDiagCnt++;
				
				//우상좌하 대각선체크.
				if(arryBingo[i][5-(i+1)]==0)	upRightDiagCnt++;
				
				if(rowZeroCnt==5)	line++;
				if(colZeroCnt==5)	line++;				
			}
			
			if(upLeftDiagCnt==5)	line++;
			if(upRightDiagCnt==5)	line++;
			
			if( line>=3 ){
				break;
			}
		}
		
		System.out.println(calledCnt);
		
		
		
//		for(int i=0; i<5; i++){
//			for(int j=0; j<5; j++){
//				System.out.print(arryBingo[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
	}
}

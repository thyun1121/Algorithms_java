package algorithmsJobs;



//Tetris_old : 내 로직 :  1X4의 테트리미노가 이중 for문으로 0,0 부터 n,n까지 계속 체크하였음.
//쓸데없는 자원낭비이며 로직이 불확실함. 40점짜리...
//알잡 강사님이 말한대로 이중 for문이 아닌 열단위로 체크하는 방식으로 다시 작성해볼 것.
import java.util.Scanner;

public class TetrisMine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();	//행
		int R = sc.nextInt();	//열
		int[][] arryTetris= new int [C][R];			//원본 배열
		int[][] arryTempTetris = new int [C][R];	//복사 배열
		
		//배열 입력
		for(int i=0; i<C; i++){
			for(int j=0; j<R; j++){
				arryTetris[i][j]=sc.nextInt();
			}
		}		
		
		arryDeepCopy(arryTetris, arryTempTetris, C, R );		
		
		int flag=0;											//break로 for-loop 나왔는지 구분을 위함.
		int[] findMax = new int[C];							//배열의 clear된 갯수를 index로, 배열[index]값은 세로칸.							
		
		for(int i=0; i<C; i++){
			for(int j=0; j<R; j++){
				for(int k=i; k<i+4; k++){
					if(k>=C || arryTempTetris[k][j]>0 ){	//배열 범위를 벗어나거나, 이미 "1"이면 break;						
						arryDeepCopy(arryTetris, arryTempTetris, C, R );
						flag++;
						break;
					}
					arryTempTetris[k][j]+=1;				//테트리미노 영역만큼 더한다.
				}
				if(flag==0){
					int sumOneRow=0;
					int cntFullRow=0;
					
					//list에 담긴 배열 중 많이 clear된 행 갯수를 구한다.
					for(int l=0; l<C; l++){
						for(int m=0; m<R; m++){
							sumOneRow+=arryTempTetris[l][m];							
							if(sumOneRow==R){
								cntFullRow++;
							}
						}
						sumOneRow = 0;
					}
					findMax[cntFullRow] = j;
					arryDeepCopy(arryTetris, arryTempTetris, C, R );			//입력한 배열대로 초기화.
					
				}else{
					flag=0;
				}							
			}
		}
		
		int max=0;
		for(int i=0; i<C; i++){
			if(findMax[i]>0){
				max = i;
			}
		}
		
		System.out.println((findMax[max]+1)+" "+max);
		
	}
	
	public static void arryDeepCopy(int[][] original,int[][] temp, int row, int col){
		if (original != null) {
			 for (int i = 0; i < row; i++) {
		        System.arraycopy(original[i], 0, temp[i], 0, col);
		    } 
	    }
	}
}



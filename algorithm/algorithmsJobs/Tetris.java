package algorithmsJobs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Tetris {
	public static int[] findMax;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();	//행
		int R = sc.nextInt();	//열
		int[][] arryTetris= new int [C][R];			//원본 배열
		int[][] arryTempTetris = new int [C][R];	//복사 배열
		findMax = new int[C];
		List<Map<Integer,Integer>> XYList = new ArrayList<Map<Integer,Integer>>();
		Map<Integer, Integer> XYMap = new HashMap<Integer,Integer>();
		
		for(int index=0; index<C; index++){
			findMax[index]= -1;
		}		
		
		//배열 입력
		for(int i=0; i<C; i++){
			for(int j=0; j<R; j++){
				arryTetris[i][j]=sc.nextInt();
			}
		}		
		
		arryDeepCopy(arryTetris, arryTempTetris, C, R );								
		
		int i;
		
		//배열의 열단위로 체크 && 테트리미노가 들어갈 행을 찾아야 함.
		for(i=0; i<R; i++){				//열.			
			for(int j=0; j<C; j++){		//행.
				if(arryTempTetris[j][i]==1){
					if(j<4){
						break;			//테트리미노가 들어갈 자리 없음.
					}else{
						XYMap.put(j-4, i);
						XYList.add(XYMap);		//테트리미노가 들어갈 좌표들을 list에 추가.
						break;
					}					
				}else{
					if(j==C-1){
						XYMap.put(j-3, i);
						XYList.add(XYMap);		//테트리미노가 들어갈 좌표들을 list에 추가.
					}
				}
			}
		}
		
		//테트리미노가 들어갈 시작 좌표부터 1을 더한다.
		for(Map<Integer, Integer> loopMap : XYList){
			for(Map.Entry<Integer, Integer> entry : loopMap.entrySet()){
				int x = entry.getKey();
				int y = entry.getValue();
				
				//테트리미노가 들어가는 좌표만큼 1을 대입한다.
				for(int k=x; k<x+4; k++){
					arryTempTetris[k][y] = 1;
				}
				
				cntClearRow(arryTempTetris, C, R, y);
				arryDeepCopy(arryTetris, arryTempTetris, C, R );
			}
		}
		
//		for(int k=0; k<findMax.length; k++){
//			System.out.print(findMax[k]+" ");
//		}
		
		//출력
		int max=-1;
		for(int k=0; k<C; k++){
			if(findMax[k]>-1){
				max = k;		//배열값이 -1이 아닌 최대 index.
			}
		}
		
		if(max>0 && findMax[max]>-1){
			System.out.println((findMax[max]+1)+" "+max);
		}else{
			System.out.println(0+" "+0);
		}
	}	
	
	public static void cntClearRow(int[][] arryTempTetris, int row, int col, int y){
		int sumOneRow=0;
		int cntFullRow=0;
		
		//list에 담긴 배열 중 많이 clear된 행 갯수를 구한다.
		for(int l=0; l<row; l++){
			for(int m=0; m<col; m++){
				sumOneRow+=arryTempTetris[l][m];							
				if(sumOneRow==col){
					cntFullRow++;
				}
			}
			sumOneRow = 0;
		}
		
		findMax[cntFullRow] = y;
	}
	
	public static void arryDeepCopy(int[][] original,int[][] temp, int row, int col){
		if (original != null) {
			 for (int i = 0; i < row; i++) {
		        System.arraycopy(original[i], 0, temp[i], 0, col);
		    } 
	    }
	}
}


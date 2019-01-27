package algorithmsJobs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/**
 * 
 * @author thyun.ahn
 * RookMine.java에서 고찰1을 적용.
 * 킹 관점으로만해도 바로 100점 나옴.
 * 
 * 나중에는 조교님이 알려준대로 방향이동 적용해볼 것.
 *   
 */
public class Rook {
	enum Direction{
		UP, DOWN, LEFT, RIGHT
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] chessMap = new int[10][10];
		Map<Integer,Integer> rookPosMap = new HashMap<Integer,Integer>();
		int findRook=-1;
		
		
		//체스판 입력.&& 킹 좌표 저장.
		for(int i=1; i<9; i++){
			for(int j=1; j<9; j++){
				chessMap[i][j] = sc.nextInt();
				if(chessMap[i][j]==1){
					rookPosMap.put(i, j);
				}
			}
		}
		
		
		for(Map.Entry<Integer, Integer> entryMap:rookPosMap.entrySet()){
			//룩이 저장된 좌표 구함.
			int x = entryMap.getKey();
			int y = entryMap.getValue();
			
			Direction direction = Direction.UP;
			findRook=-1;
			
			//룩의 좌표로부터 상,하,좌,우 체크.
			while(true){
				switch(direction){
					case UP:
						x--;
						if(chessMap[x][y]==2)
							findRook=1;
						else if(x<1||chessMap[x][y]!=0){
							direction = Direction.DOWN;
							x = entryMap.getKey();
							y = entryMap.getValue();
						}							
						break;
					case DOWN:
						x++;
						if(chessMap[x][y]==2)
							findRook=1;
						else if(x>8||chessMap[x][y]!=0){
							direction = Direction.LEFT;
							x = entryMap.getKey();
							y = entryMap.getValue();
						}							
						break;
					case LEFT:
						y--;
						if(chessMap[x][y]==2)
							findRook=1;
						else if(y<1||chessMap[x][y]!=0){
							direction = Direction.RIGHT;
							x = entryMap.getKey();
							y = entryMap.getValue();
						}							
						break;
					case RIGHT:
						y++;
						if(chessMap[x][y]==2)
							findRook=1;
						else if(y>8||chessMap[x][y]!=0){
							findRook = 0;
							break;
						}							
						break;
				}
				
				if(findRook==1||findRook==0)
					break;
			}
		}
		System.out.println(findRook);
		
		//printArry(chessMap);	//출력.
	}
	
	public static void printArry(int[][] chessMap){
		for(int i=1; i<9; i++){
			for(int j=1; j<9; j++){
				System.out.print(chessMap[i][j]+" ");
			}
			System.out.println();
		}
	}

}

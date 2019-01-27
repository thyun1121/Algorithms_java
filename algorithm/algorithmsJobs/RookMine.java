package algorithmsJobs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/**
 * 
 * @author thyun.ahn
 * 점수 : 90
 * 로직 문제점
 * 	1.룩 관점에서 진행함. 룩은 두개까지 있을 수 있으므로 모든 상황을 고려하면 복잡해짐.
 * 		킹 관점에서 진행해볼 것.
 * 	2.방향 이동을 switch-case문으로 함. 이방법은 다른 경우가 추가되는 경우. 재사용하기 어려워짐.
 *   	방향이동은 int[] dirX = {-1,0,1,0};
 *   			int[] dirY = {0,-1,0,1};
 *   	for문 이용하여 x+dirX[i], y+dirY[i]; 와 같이 이용해볼것.
 *   
 * 시행착오
 * 	1. 초기화한 변수 위치 중요!!
 *     Direction direction = Direction.UP;
	   indRook=-1;
	   처음에 main의 첫부분에 넣었더니, 반복문 끝나고 다시 초기화되지 않아서 디버깅해야했음.
				
 */
public class RookMine {
	enum Direction{
		UP, DOWN, LEFT, RIGHT
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] chessMap = new int[10][10];
		List<Map<Integer,Integer>> rookPosList = new ArrayList<Map<Integer,Integer>>();
		int findRook=-1;
		
		
		//체스판 입력.&& 상대룩 좌표 저장.
		for(int i=1; i<9; i++){
			for(int j=1; j<9; j++){
				chessMap[i][j] = sc.nextInt();
				if(chessMap[i][j]==2){
					Map<Integer,Integer> rookPosMap = new HashMap<Integer,Integer>();
					rookPosMap.put(i, j);
					rookPosList.add(rookPosMap);
				}
			}
		}
		
		
		for(Map<Integer, Integer> findRookMap : rookPosList){
			for(Map.Entry<Integer, Integer> entryMap:findRookMap.entrySet()){
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
							if(chessMap[x][y]==1)
								findRook=1;
							else if(x<1||chessMap[x][y]!=0){
								direction = Direction.DOWN;
								x = entryMap.getKey();
								y = entryMap.getValue();
							}							
							break;
						case DOWN:
							x++;
							if(chessMap[x][y]==1)
								findRook=1;
							else if(x>8||chessMap[x][y]!=0){
								direction = Direction.LEFT;
								x = entryMap.getKey();
								y = entryMap.getValue();
							}							
							break;
						case LEFT:
							y--;
							if(chessMap[x][y]==1)
								findRook=1;
							else if(y<1||chessMap[x][y]!=0){
								direction = Direction.RIGHT;
								x = entryMap.getKey();
								y = entryMap.getValue();
							}							
							break;
						case RIGHT:
							y++;
							if(chessMap[x][y]==1)
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

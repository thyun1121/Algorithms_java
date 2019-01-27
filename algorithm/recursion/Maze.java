package recursion;

public class Maze {
	private static int N=8;
	private static int [][] maze = {
			 {0,0,0,0,0,0,0,1}
			,{0,1,1,0,1,1,0,1}
			,{0,0,0,1,0,0,0,1}
			,{0,1,0,0,1,1,0,0}
			,{0,1,1,1,0,0,1,1}
			,{0,1,0,0,0,1,0,1}
			,{0,0,0,1,0,0,0,1}
			,{0,1,1,1,0,1,0,0}
	};
	
	private static final int PATHWAY = 0;
	private static final int WALL = 1;
	private static final int BLOCKED = 2;
	private static final int PATHED = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findMazePath(0,0));

	}
	
	public static boolean findMazePath(int x, int y){
		if(x<0||y<0||x>N-1||y>N-1){
			return false;
		}else if(maze[x][y] != PATHWAY){
			return false;
		}else if(x==N-1 && y==N-1){
			maze[x][y] = PATHED;
			return true;
		}else{
			maze[x][y] = PATHED;
			if(findMazePath(x-1,y)||findMazePath(x,y+1)||findMazePath(x+1,y)||findMazePath(x,y-1)){
				return true;
			}
			maze[x][y] = BLOCKED; //true를 반환하지 못했으므로 길이 없다는 뜻. 즉 해당 위치를 blocked 표시한다.
			return false;
		}
	}

}

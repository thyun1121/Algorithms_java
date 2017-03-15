package recursionPrac;

public class Maze {
	private static int N = 8;
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
	
	private static final int PATHWAY 	= 0;
	private static final int WALL 		= 1;
	private static final int BLOCKED 	= 2;
	private static final int PATHED		= 3;
	
	public static void main(String[] args) {
		int x=0;
		int y=0;
		
		System.out.println(findMaze(x,y));
	}
	
	
	public static boolean findMaze(int x, int y){
		if(x<0||y<0||x>=N||y>=N){
			return false;
		}else if(maze[x][y] != PATHWAY){
			return false;
		}else if(x==N-1 && y==N-1){
			return true;			
		}else{
			maze[x][y] = PATHED;
			if(findMaze(x, y+1)||findMaze(x,y-1)||findMaze(x+1, y)||findMaze(x-1,y)){
				return true;
			}
			
			maze[x][y] = BLOCKED;
			return false;
		}
	}
	
	
	

}

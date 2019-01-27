package recursion;

public class Blob {

	private static int N = 8;
	private static int [][] blob = {
			 {1,0,0,0,0,0,0,1}
			,{0,1,1,0,0,1,0,0}
			,{1,1,0,0,1,0,1,0}
			,{0,0,0,0,0,1,0,0}
			,{0,1,0,1,0,1,0,0}
			,{0,1,0,1,0,1,0,0}
			,{1,0,0,0,1,0,0,1}
			,{0,1,1,0,0,1,1,1}
	};
	
	private static int BACKGROUND_COLOR = 0;
	private static int IMAGE_COLOR      = 1;
	private static int PASSED_COLOR     = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countCells(0,0));
	}
	
	private static int countCells(int x, int y){
		if(x<0 || y<0 || x>7 || y>7){
			return 0;
		}else if(blob[x][y] != IMAGE_COLOR){
			return 0;
		}else{
			blob[x][y] = PASSED_COLOR;
			return 1+countCells(x-1, y+1)+countCells(x,y+1)+countCells(x+1,y+1)+countCells(x-1,y)
					+countCells(x+1,y)+countCells(x-1,y-1)+countCells(x,y-1)+countCells(x+1,y-1);
		}
	}

}

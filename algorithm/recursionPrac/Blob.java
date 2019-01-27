package recursionPrac;

import java.nio.charset.MalformedInputException;

public class Blob {
	public static int N = 8;
	
	public static int[][] blob =  {
			 {1,0,0,0,0,0,0,1}
			,{0,1,1,0,0,1,0,0}
			,{1,1,0,0,1,0,1,0}
			,{0,0,0,0,0,1,0,0}
			,{0,1,0,1,0,1,0,0}
			,{0,1,0,1,0,1,0,0}
			,{1,0,0,0,1,0,0,1}
			,{0,1,1,0,0,1,1,1}
	};
	
	public static int BACKGROUND_COLOR 	= 0;
	public static int IMAGE_COLOR 		= 1;
	public static int PASSED_COLOR 		= 2;
	
	
	public static void main(String[] args) {
		System.out.println(countCells(3, 5));
	}
	
	
	
	public static int countCells(int x, int y){
		if(x<0||y<0||x>7||y>7){
			return 0;
		}else if(blob[x][y] != IMAGE_COLOR){
			return 0;
		}else{
			blob[x][y] = PASSED_COLOR;
			return 1+countCells(x, y+1)
				+countCells(x, y-1)+countCells(x+1, y)
				+countCells(x-1, y)+countCells(x-1, y+1)
				+countCells(x+1,y+1)+countCells(x+1,y-1)
				+countCells(x-1,y-1);
		}
	}
	
	
	
}

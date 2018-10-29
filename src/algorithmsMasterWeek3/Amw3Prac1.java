package algorithmsMasterWeek3;

import java.util.Arrays;
import java.util.Scanner;

//삼각 위의 최대경로
public class Amw3Prac1 {
	static int N = 5;
	static int[][] board = new int [10][10];
	static int[][] cache = new int [10][10];
	
	public static void main(String[] args) {
		for(int[] row : cache){
			Arrays.fill(row, -1);
		}
		
		Scanner sc = new Scanner(System.in);		
		for(int i=0; i<N; i++){
			for(int j=0; j<i+1; j++){
				board[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println(recursive(0,0));
	}
	
	//현재(y,x)로 시작했을 때의 최대경로의 합.
	//f(y,x) = board[y][x]+max(f(y+1, x), f(y+1, x+1))
	//이전까지 구한합이 sum일 때
	public static int recursive(int y, int x){
		if(y==N-1){
			return board[y][x];
		}
		
		if(cache[y][x] != -1){
			return cache[y][x];
		}
		
		return cache[y][x] = Math.max(recursive(y+1,x),recursive(y+1,x+1))+board[y][x];
	}
}

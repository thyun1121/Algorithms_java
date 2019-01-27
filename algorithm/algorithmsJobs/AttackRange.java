package algorithmsJobs;
import java.util.Scanner;

public class AttackRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] gameMap = new int[N+2][N+2];
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		
		//left.
		for(int i=0; i<=r; i++){
			gameMap[x][y-i]=i;		//left
			for(int j=i; j<=r-i; j++){
				gameMap[x-j][y-i]=gameMap[x][y-i]+j;	//top
				gameMap[x+j][y-i]=gameMap[x][y-i]+j;	//below
			}
		}
		
		
		printArry(gameMap, N+2, N+2);
	}
	
	public static void printArry(int[][] Map, int X, int Y){
		for(int i=1; i<X-1; i++){
			for(int j=1; j<X-1; j++){
				System.out.print(Map[i][j]+" ");
			}
			System.out.println();
		}
	}

}

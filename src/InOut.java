import java.util.Scanner;

public class InOut {

	public static void main(String[] args) {		
		int[][] map = new int[12][12];
		
		Scanner sc = new Scanner(System.in);
		
		int allExec = sc.nextInt();
		int nowExec = 0;
		while(nowExec < allExec){
			nowExec++;
			for(int i=1; i<=10; i++){
				map[nowExec][i]=map[nowExec][i]==0?1:0;			//가로.
				
				if(i!=nowExec)
					map[i][nowExec]=map[i][nowExec]==0?1:0;		//세로.
			}
		}
		
		for(int i=1; i<11; i++){
			for(int j=1; j<11; j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}

	}

}

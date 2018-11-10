import java.util.PriorityQueue;
import java.util.Scanner;

public class Danji {
	public static int[][] arryMap;
	public static PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	public static int count=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str;
		
		arryMap = new int[N][N];
		for(int i=0; i<N; i++){
			str = sc.next();
			for(int j=0; j<N; j++){
				arryMap[i][j]=str.charAt(j)-'0';
			}
		}
		
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				if(arryMap[i][j]==1){
					count=0;
					recursion(N,i,j);
					pq.add(count);
				}
			}
		}
		
		System.out.println(pq.size());
		while(!pq.isEmpty()){
			System.out.println(pq.poll());
		}
	}
	
	public static boolean recursion(int N, int x, int y){
		if(x>=N||y>=N||x<0||y<0){
			return false;
		}
		if(arryMap[x][y]==0){
			return false;
		}
		count++;
		arryMap[x][y]=0;
		
		if(recursion(N,x+1,y)||recursion(N,x-1,y)||recursion(N,x,y+1)||recursion(N,x,y-1)){
			return true;
		}
		
		return false;		
	}
}

package algorithmsJobs.course5;
import java.util.Scanner;

public class TreeDepth {
	public static int maxDepth;
	public static int cnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	//node count
		int R = sc.nextInt();	//root node
		
		int[] parent = new int[N];
		
		for(int i=1; i<N; i++){
			int parentNode = sc.nextInt();
			int childNode = sc.nextInt();
			
			parent[childNode] = parentNode; 
		}
		
		for(int i=parent.length-1; i>=0; i--){
			findTreeDepth(parent, i, R);	
		}
		
		System.out.println(maxDepth);
		
	}
	
	public static void findTreeDepth(int[] parent, int index, int rootNode){
		if(index==rootNode){
			maxDepth = (maxDepth>cnt)?maxDepth: cnt;
			cnt=0;
			return;
		}
		cnt++;
		findTreeDepth(parent, parent[index], rootNode);
	}
}

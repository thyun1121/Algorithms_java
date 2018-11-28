package algorithmsJobs.course5;
import java.util.ArrayList;
import java.util.Scanner;

public class NodeDistance1 {
	public static ArrayList<Integer> parentXList = new ArrayList<Integer>();
	public static ArrayList<Integer> parentYList = new ArrayList<Integer>();
	public static int depth = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int[] parent = new int[N];
		
		for(int i=1; i<N; i++){
			int parentNode = sc.nextInt();
			int childNode = sc.nextInt();
			
			parent[childNode] = parentNode;
		}
		
		if(X==Y)
			System.out.println(0);
		else{
			findLCA(parent, X, parentXList);
			findLCA(parent, Y, parentYList);
			//findTreeDepthX(parent, X);
			
			ArrayList<Integer> cmmnParentList = new ArrayList<Integer>(parentXList);
			cmmnParentList.retainAll(parentYList);
			
			int cmmnParentNode = cmmnParentList.get(0);
			//System.out.println(cmmnParentNode);
			
			findTreeDepth(parent, cmmnParentNode, X);
			//System.out.println(depth);
			findTreeDepth(parent, cmmnParentNode, Y);
			
			System.out.println(depth);
		}
	}
	
	public static void findTreeDepth(int[] parent, int cmmnParent, int node){
		if(node==cmmnParent){
			return;
		}
		depth++;
		findTreeDepth(parent, cmmnParent, parent[node]);
	}
	
	public static void findLCA(int[] parent, int startNode, ArrayList<Integer> parentList){
		if(startNode==0){
			parentList.add(0);			//테스트케이스 상 0이 들어올때 부모노드를 0으로 넣어줘야 함. 사실 테스트케이스의 오류임.
			return;
		}
		
		parentList.add(startNode);			//테스트케이스는 본인노드도 부모로 간주하므로. 사실 테스트케이스의 오류임.
		parentList.add(parent[startNode]);
		findLCA(parent, parent[startNode], parentList);
	}

}

package algorithmsJobs.course5;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * 
 * @author thyun.ahn
 * 
 * arraylist의 retainAll 처음써봄.
 * 
 *
 */
public class LCA {
	public static ArrayList<Integer> parentListX = new ArrayList<Integer>(); 
	public static ArrayList<Integer> parentListY = new ArrayList<Integer>();
	
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
		
		findLCA(parent, X, parentListX);
		findLCA(parent, Y, parentListY);
		
		ArrayList<Integer> commonArryList = new ArrayList<Integer>(parentListX);
		commonArryList.retainAll(parentListY);
		
		System.out.println(commonArryList.get(0));
	}
	
	public static void findLCA(int[] parent, int node, ArrayList<Integer> parentArryList){
		if(node==0){				//테스트케이스 상 0이 들어올때 부모노드를 0으로 넣어줘야 함. 사실 테스트케이스의 오류임.
			parentArryList.add(0);
			return;
		}
			
		parentArryList.add(node);			//테스트케이스는 본인노드도 부모로 간주하므로. 사실 테스트케이스의 오류임.
		parentArryList.add(parent[node]);
		findLCA(parent, parent[node], parentArryList);
	}
	
}

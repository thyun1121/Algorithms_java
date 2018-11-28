package algorithmsJobs.course5;
import java.util.Scanner;

class Tree{
	public int left;
	public int right;
}
public class TreeTraversal {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a, b, c;
		
		Tree[] tree =  new Tree[N];
		for(int i=0; i<N; i++){
			a=sc.nextInt();
			tree[a] = new Tree();
			tree[a].left = sc.nextInt();
			tree[a].right = sc.nextInt();
		}
		
		preTraversal(0, tree);
		System.out.println();
		midTraversal(0, tree);
		System.out.println();
		posTraversal(0, tree);
		
	}
	/**
	 * 
	 * @param n
	 * @param tree
	 * 
	 * 0
	 * 1 2
	 * 34 5
	 */
	public static void posTraversal(int n, Tree[] tree){
		if(n==-1){
			return;
		}
		
		if(tree[n].left!=-1)
			posTraversal(tree[n].left, tree);
		if(tree[n].right!=-1)
			posTraversal(tree[n].right, tree);
		System.out.print(n+" ");
	}
	
	public static void midTraversal(int n, Tree[] tree){
		if(n==-1){
			return;
		}
		
		if(tree[n].left!=-1)
			midTraversal(tree[n].left, tree);
		System.out.print(n+" ");
		if(tree[n].right!=-1)
			midTraversal(tree[n].right, tree);
	}
	
	//n을 root로 하는 전위 트리 탐색.
	public static void preTraversal(int n, Tree[] tree){
		if(n==-1){
			return;
		}
		System.out.print(n+" ");
		if(tree[n].left!=-1)
			preTraversal(tree[n].left, tree);
		
		if(tree[n].right!=-1)
			preTraversal(tree[n].right, tree);
	}

}

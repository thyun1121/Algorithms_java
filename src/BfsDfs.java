import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/**
 * 
 * @author thyun.ahn
 * 
 * 입력
 * 4 5
	0 1
	0 2
	0 3
	1 3
	2 3
 *
 */
public class BfsDfs {
	public static ArrayList<Integer>[] graphList;
	public static boolean[] visited;    
	public static Queue<Integer> queue;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		visited = new boolean[N+1];
		graphList = new ArrayList[N];
		
		for(int i=0; i<N; i++){
			graphList[i] = new ArrayList<Integer>();
		}
			
		for(int i=0; i<M; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			graphList[a].add(b);
			graphList[b].add(a);
		}
		
		for(int i=0; i<graphList.length; i++){
			Collections.sort(graphList[i]);
		}
		
		dfs(0);
		
		System.out.println();
		visited = new boolean[N+1];		//visited initialized for bfs.
		queue = new LinkedList<Integer>();
		
		bfs(0);
	}
	
	public static void bfs(int idx){
		queue.offer(idx);
		visited[idx] = true;
		while(!queue.isEmpty()){
			int current = queue.poll();
			System.out.print(current+" ");
			for(int i=0; i<graphList[current].size(); i++){
				if(!visited[graphList[current].get(i)]){
					queue.offer(graphList[current].get(i));
					visited[graphList[current].get(i)]=true;
				}	
			}
		}
	}
	
	public static void dfs(int idx){		
		visited[idx] = true;
		System.out.print(idx+" ");
		
		for(int i=0; i<graphList[idx].size(); i++){
			if( !visited[graphList[idx].get(i)] ){
				dfs(graphList[idx].get(i));
			}
		}
	}
}

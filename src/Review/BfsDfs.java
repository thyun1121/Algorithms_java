package Review;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 
 * @author thyun.ahn
 * 
 * input
 * 9 12
	0 1
	0 2
	0 3
	1 5
	2 5
	3 4
	4 5
	5 6
	5 7
	5 8
	6 7
	7 8
 *
 */

public class BfsDfs {
	public static int N ;	//vertex
	public static int M ;	//edge
	public static boolean[] checked;
	public static ArrayList<Integer>[] al;
	public static Queue<Integer> queue;
	
			
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		checked= new boolean[N+1];
		al = new ArrayList[N];
		for(int i=0; i<N; i++){
			al[i] = new ArrayList<Integer>();
		}
		for(int i=0; i<M; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			al[a].add(b);
			al[b].add(a);
		}
		
		dfs(0);
		System.out.println();
		checked = new boolean[N+1];
		queue = new LinkedList<Integer>();
		bfs(0);
	}
	
	public static void bfs(int start){
		
		queue.add(start);
		checked[start] = true;
		int current;
		while(!queue.isEmpty()){
			current = queue.poll();
			
			System.out.print(current);
			for(int i=0; i<al[current].size(); i++){
				if(!checked[al[current].get(i)]){
					queue.add(al[current].get(i));
					checked[al[current].get(i)] = true;
				}
			}
		}
	}
	
	public static void dfs(int start){
		checked[start] = true;
		System.out.print(start);
		
		for(int i=0; i<al[start].size(); i++){
			if(!checked[al[start].get(i)])
				dfs(al[start].get(i));
		}
	}

}

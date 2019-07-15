package Review;

import java.util.ArrayList;
import java.util.Collections;
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
	public static boolean[] checked;
	public static ArrayList<Integer>[] al;
	public static Queue<Integer> queue;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		checked = new boolean[N];
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
		
		for(int i=0; i<al.length; i++){
			Collections.sort(al[i]);  // 만약 숫자가 오름차순으로 정렬안되었을 경우 대비.
		}
		
		
		dfs(0);
		checked = new boolean[N];
		queue = new LinkedList<Integer>();
		System.out.println();
		bfs(0);
	}
	
	public static void bfs(int index){
		queue.add(index);
		checked[index] = true;
		while(!queue.isEmpty()){
			int base = queue.poll();
			for(int i=0; i<al[base].size(); i++){
				if(!checked[al[base].get(i)]){
					queue.add(al[base].get(i));
					checked[al[base].get(i)] = true;
				}
			}
			System.out.print(base);
		}
	}
	
	public static void dfs(int index){
		checked[index] = true;
		System.out.print(index);
		for(int i=0; i<al[index].size(); i++){
			if(!checked[al[index].get(i)]){
				dfs(al[index].get(i));
			}
		}
		
	}

}

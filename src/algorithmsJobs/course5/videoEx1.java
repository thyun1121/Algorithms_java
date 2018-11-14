package algorithmsJobs.course5;

import java.util.Scanner;

/**
 * 
 * @author thyun.ahn
 * 문제 : 이진트리 순회. -1은 자식노드 없음을 의미.
 * 입력
 * 5
 * 1 2 3
 * 2 4 5
 * 3 -1 -1
 * 4 -1 -1
 * 5 -1 -1
 * 
 * 출력.
 * 1) 전위순회, 중위순회, 후위순회 순으로 출력.
 *
 */

class Tree {
	int left;
	int right;
}

public class videoEx1 {
	public static void main(String[] args) {
		//Tree[i] : 노드 i의 정보를 담고있음.
		//Tree[i].left : 노드 i의 좌측 노드.
		//Tree[i].right : 노드 i의 우측 노드.
		Tree[] arryTree = new Tree[100];
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			//Tree[a] = 
		}
		
	}
}

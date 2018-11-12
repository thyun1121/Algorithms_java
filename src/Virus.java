import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author thyun.ahn
 * 
 * 1) arrayList[] 을 처음 써보는 듯 하다..
 * 2) 이중 배열을 처음생각했지만, 그것보단 arrayList[]을 사용하여, 네트워킹된 컴퓨터 값만 갖고 있는게 더 간편.
 * 3) arryList로 컴퓨터 네트워킹 정보 담은 후 recursion에서 어떻게 갖고올지 많이 고민함. 
 * 		recursion을 아래와 같이 구현하면 쉽게 바이러스 걸린 컴퓨터를 찾을 수 있다. 항상 참고!!
 *
 */

public class Virus {
	public static ArrayList <Integer>[] al;
	public static boolean[] checked;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();				//computer count
		int networkCnt = sc.nextInt();		//newtwork count
		
		al =  new ArrayList[N+1];
		checked = new boolean[N+1];
		
		for(int i=1; i<=N; i++){
			al[i] = new ArrayList<Integer>();
		}
		
		for(int i=1; i<=networkCnt; i++){
			int com1 = sc.nextInt();
			int com2 = sc.nextInt();
			al[com1].add(com2);
			al[com2].add(com1);
		}
		
		checked[1]=true;
		recursion(N, 1);
		
		int cnt = 0;
		for(boolean bl : checked){
			if(bl) cnt++;			
		}
		System.out.println(cnt-1);
			
	}
	
	public static void recursion(int N, int idx){
		if(idx==N)
			return;
		
		for(int i : al[idx]){
			if(!checked[i]){
				checked[i]=true;
				recursion(N, i);
			}
		}
		
	}

}

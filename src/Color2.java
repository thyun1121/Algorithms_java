import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Color2 {
	public static ArrayList<Integer>[] graphList;
	public static String[] colors = {"G","B"};
	public static String[] colored;
	public static Queue<Integer> queue = new LinkedList<Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		colored = new String[N];
		graphList = new ArrayList[N];
		
		
		for(int i=0; i<graphList.length; i++){
			graphList[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<M; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			graphList[a].add(b);
			graphList[b].add(a);
		}
		
		bfs(0);
	}
	
	public static void bfs(int idx){
		queue.offer(idx);
		int colorIdxFlag = 0; 
		colored[idx] = colors[colorIdxFlag];
		boolean colorFailed = true;
		while(!queue.isEmpty()){
			int current = queue.poll();
			//colorIdxFlag = colorIdxFlag==0?1:0;
			colorIdxFlag = colored[current].equals("G")?1:0;
			for(int i=0; i<graphList[current].size(); i++){

				if( (colored[graphList[current].get(i)]==null) ){
					queue.offer(graphList[current].get(i));
					colored[graphList[current].get(i)] = colors[colorIdxFlag];
				}else{
					if(colored[current].equals(colored[graphList[current].get(i)])){
						colorFailed = false;
						break;
					}
				}
			}
			
			if(colorFailed==false)
				break;			
		}
		
		if(colorFailed) System.out.println("YES");
		else	System.out.println("NO");
	}

}

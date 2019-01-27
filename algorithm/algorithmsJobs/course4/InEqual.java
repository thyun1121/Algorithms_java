package algorithmsJobs.course4;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author thyun.ahn
 * 흐아.. 다 풀어놓구서..
 * inEqualArry[str.length()] 이 부분에서 index 값을 제대도 넣지 못하고 있었다...
 * 겨우 풀었다..ㅜㅜ
 *
 */


public class InEqual {

	public static String[] inEqualArry;
	public static boolean[] visited = new boolean[10];
	public static String str = "";
	public static ArrayList<String> al = new ArrayList<String>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		inEqualArry = new String[N+1];
		
		for(int i=1; i<=N; i++){
			inEqualArry[i] = sc.next();
		}
		
		recursion(N);
		
		System.out.println(al.get(al.size()-1));
		System.out.println(al.get(0));
	}
	
	public static void recursion(int N){
		if(str.length()==N+1){
			al.add(str);
			return;
		}
		for(int i=0; i<10; i++){
			if(!visited[i]){
				if(str.length()>=1){
					if("<".equals(inEqualArry[str.length()])){
						if(Integer.parseInt(str.substring(str.length()-1))>=i)
							continue;
					}else if(">".equals(inEqualArry[str.length()])){
						if(Integer.parseInt(str.substring(str.length()-1))<=i)
							continue;
					}
				}			
				
				str+=i;
				visited[i]=true;
				recursion(N);
				str=str.substring(0, str.length()-1);
				visited[i]=false;
			}			
		}
	}
}

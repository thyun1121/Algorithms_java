package recursionPrac;

public class NQueens {
	
	private static  int N = 7;
	private static int [] cols = new int[N+1];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queens(0);
	}
	
	
	public static boolean queens(int level){
		if(!promising(level)){
			return false;
		}else if(level == N){
			for(int i=0; i<=N; i++){
				System.out.println("("+i+","+cols[i]+")");
			}
			return true;
		}else{
			for(int i=1; i<=N; i++){
				cols[level+1] = i;
				if(queens(level+1)){
					return true;
				}
			}
			return false;
		}
	}
	
	public static boolean promising(int level){
		for(int i=0; i<level; i++){
			if(cols[i] == cols[level]){
				return false;
			}
			
			if(Math.abs(level - i) == Math.abs(cols[i] - cols[level])){
				return false;
			}
		}
		
		return true;
	}
	
	
}

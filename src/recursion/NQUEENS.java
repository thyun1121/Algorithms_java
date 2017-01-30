package recursion;

public class NQUEENS {

	static int N = 7;
	
	static int [] cols = new int [N+1];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(cols[7]);
		queens(0);
	}

	//queens함수는 어떤 노드에 도착한 순간이다. 그리고 그 노드에서 어떠한 일들을 해야하는지 구현한 메소드.
	public static boolean queens(int level){
		if(!promising(level)){
			//System.out.println("infeasible");
			return false;
		}else if(level == N){
			for(int i=0; i<=N; i++){
				System.out.println("("+i+","+cols[i]+")");
			}
			return true;
		}else{							//자식노드 놓는 방법에 대한 로직.
			//level+1을 놓을 수 있는 경우의 수는 N가지.
			//우선 1에 두고 recursion함. 중간에 맞지 않으면 false를 뱉은 후 2에 둠. 반복. 맞으면 그대로 true. 
			for(int i=1; i<=N; i++){
				cols[level+1] = i;
				if(queens(level+1)){
					return true;
				}
			}
			return false;
		}		
	}
	
	
	/*현재까지 놓인 말들이 충돌하는지 여부를 checking*/
	public static boolean promising(int level){
		for(int i=0; i<level;i++){
			if(cols[i]==cols[level]){
				return false;
			}else if(Math.abs(level-i) == Math.abs(cols[level]-cols[i])){
				return false;
			}
		}
		return true;
	}
}

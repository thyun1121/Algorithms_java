
public class Testing {
	public static void main(String[] args) {
		int N = 7;
		int answers = 0;
		boolean flag=false;
		for(int i=2; i<=N; i++){
			if(i==2)
				flag=true;
			else{
				for(int j=2; j<=i-1; j++){
					if(i%j==0){
						break;
					}
					flag = true;
				}
			}
			
			if(flag){
				answers+=i;
				flag = false;
			}
		}
		
		System.out.println(answers);
	}

}

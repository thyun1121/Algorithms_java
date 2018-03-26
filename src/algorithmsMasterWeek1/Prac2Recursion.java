package algorithmsMasterWeek1;
//n부터 m까지의 합을 구하라 (1<=n,m<=10000)
//입력 2(testCase),3 5,10 1000
//출력 12, 50045
//+) 다른 방법으로는 부분합 방식 사용.
public class Prac2Recursion {
	public static void main(String[] args) {
		int n=10, m=1000;
		System.out.println(getSum(n, m));
	}
	
	public static int getSum(int n, int m){
		if(n==m){
			return n;
		}else{
			return m+getSum(n, m-1);
		}
	}
	
	
}

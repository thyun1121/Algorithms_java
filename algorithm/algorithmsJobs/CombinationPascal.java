package algorithmsJobs;
import java.util.Scanner;

//week3
/**
 * 
 * @author thyun.ahn
 *
 *	아래의 조합 공식을 사용하여 해결하려하였으나, int의 범위를 넘기기도 하고, 시간복잡도가 매우 커지는 바람에 50점 나옴..
 *	child!/parent!*(child-parent)!
 *
 *  현재 이 코드와 같이 파스칼의 삼각형 공식을 이용해야 함.
 *  nCr = n-1Cr-1 + n-1Cr
 *  
 *  http://nackwon.tistory.com/55 참고. 11050
 *
 */
public class CombinationPascal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int result = combination(n,m);
		
		System.out.println(result);
	}
	
	public static int combination(int n, int m){
		if(n==m||m==0)
			return 1;
		return combination(n-1,m-1)+combination(n-1, m);
	}

}

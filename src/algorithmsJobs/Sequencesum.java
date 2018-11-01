package algorithmsJobs;
import java.util.Scanner;

//week3
/**
 * 
 * @author thyun.ahn
 * 수학적 사고 필요.
 * S(a,b)+S(b,c)+S(a,c)=total을 이용해볼 것.
 *
 */
public class Sequencesum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arry = new int[n+2][n+2];
		
		for(int i=1; i<n+1; i++){
			for(int j=1; j<n+1; j++){
				arry[i][j] = sc.nextInt();
			}
		}
		
		int tempSum = arry[1][2]+arry[1][3]+arry[2][3];
		tempSum = tempSum/2;
		int first = tempSum-arry[2][3];		//find first number
		
		for(int i=0; i<n; i++){
			if(i==0)
				System.out.print(first+" ");
			else
				System.out.print(arry[1][i+1]-first+" ");
		}
		
		
		
		
//		for(int i=1; i<n+1; i++){
//			for(int j=1; j<n+1; j++){
//				System.out.print(arry[i][j]+" ");
//			}
//			System.out.println();
//		}
	}

}

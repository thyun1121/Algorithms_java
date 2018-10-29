import java.util.Scanner;

//week3
/**
 * 
 * @author thyun.ahn
 *
 *	child!/parent!*(child-parent)!
 *  주어진 수에서 2,5의 소인수 개수를 구하고 그 중 작은 갯수인 것이 10을 만드는 개수이며 이것은 곧 0의 개수를 뜻하게 된다. 
 *
 */
public class Combinationzero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		//System.out.println(combination(n,m));
		System.out.println(countFive(n));
		
	}
	
	public static int countFive(int N){
		int count = 0;
        for (int i = 5; N / i >= 1; i *= 5) {
            count += N / i;
        }
 
        return count;
	}

}

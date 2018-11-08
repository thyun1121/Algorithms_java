import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static ArrayList<Integer> box = new ArrayList<>();

	public static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 총 몇개의 숫자를 입력 받을 것인지
		int a;
		int b = 0;
		int c = 0;

		a = sc.nextInt();
		// b = sc.nextInt();

		c = b;

		naturalSum(a, a - 1, 0, "");

		System.out.println(count);
	}

	public static void naturalSum(int k, int n, int sum, String x) {

		if (n <= 0 || sum > k)
			return;
		else if (sum == k) { // 끝에서 "+" 빼야함
			System.out.println(x.substring(0, x.length() - 1));
			count++;

		} else {
			if (n + sum > k) {
				while (n + sum > k) {
					n--;
				}
			}
			naturalSum(k, n, sum + n, x + n + "+");
			naturalSum(k, n - 1, sum, x);
		}

	}
}
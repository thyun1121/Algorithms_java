package algorithmsMasterWeek22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HW3 {
	static int[] array;
	static StringBuilder sb = new StringBuilder();
	static int k;
	static int cnt;

	private void solve() {
		Scanner sc = new Scanner(System.in);

		while ((k = sc.nextInt()) != 0) {
			array = new int[13];

			for (int i = 0; i < k; i++) {
				array[i] = sc.nextInt();
			}

			for (int i = 0; i < k - 5; i++) {
				cnt = 1;
				dfs(i, array[i] + " ");
			}

			sb.append("\n");
		}
		System.out.println("result :: "+sb.toString());
	}

	public static void dfs(int v, String str) {
		if (cnt == 6) {
			sb.append(str + "\n");
			System.out.println("====>  "+sb.toString());
		} else {
			for (int i = v + 1; i < k; i++) {
				++cnt;
				dfs(i, str + array[i] + " ");
			}
		}
		--cnt;
	}

	public static void main(String[] args) {
		//sc.init();	

		new HW3().solve();
	}

}

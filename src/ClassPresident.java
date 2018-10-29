import java.util.Scanner;

public class ClassPresident {
	static int[][] arr = new int [1005][5];
	static boolean[][] chk = new boolean [1002][1002];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
			for (int k = 0; k < 5; k++)
				arr[i][k]=sc.nextInt();


		for (int i = 0; i < 5; i++)
			for (int k = 0; k < n; k++)
				for (int j = k + 1; j < n; j++)
				{
					if (arr[k][i] == arr[j][i])
						chk[k][j] = chk[j][k] = true;
				}

		int cnt, MAX = 0, ppl = 0;
		for (int i = n - 1; i >= 0; i--)
		{
			cnt = 0;
			for (int k = 0; k < n; k++)
				if (chk[i][k]) cnt++;


			if (cnt >= MAX)
			{
				MAX = cnt;
				ppl = i;
			}
		}
		System.out.println(ppl+1);
	}

}

package baekjoon;
import java.util.ArrayList;
import java.util.Scanner;

public class DeliverSugar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		while(true){
			if(n%5 == 0){
				System.out.println(n/5+cnt);
				break;
			}else if(n<3){
				System.out.println(-1);
				break;
			}
			n-=3;
			cnt++;
		}
	}
}
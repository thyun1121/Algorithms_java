import java.util.Scanner;

public class ColorPaper {
	static int[][] arryMap = new int [102][102];
	 
	    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i=1;i<=n;++i){
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        int w = sc.nextInt();
	        int h = sc.nextInt();
	        for(int j=x;j<x+w;++j){
	            for(int k=y;k<y+h;++k){
	            	arryMap[j][k]=i;
	            }
	        }
	    }
	    for(int k=1;k<=n;k++){
	        int cnt=0;
	        for(int i=0;i<102;i++){
	            for(int j=0;j<102;j++){
	                if(arryMap[i][j]==k){
	                	cnt++;
	                }
	            }
	        }
	        System.out.println(cnt);
	    }

	}

}

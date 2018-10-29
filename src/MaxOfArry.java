import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class MaxOfArry {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	public static void main(String args[]) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int max = 0; int row = 0; int col = 0; 
		for (int i = 0; i < 9; i++) { 
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			for (int j = 0; j < 9; j++) { 
				int temp = Integer.parseInt(st.nextToken()); 
				if (max < temp) { 
					max = temp; 
					row = i + 1; 
					col = j + 1; 
				} 
			} 
		} 
		bw.write(String.valueOf(max)); 
		bw.write("\n"); 
		bw.write(String.valueOf(row)); 
		bw.write(" "); 
		bw.write(String.valueOf(col)); 
		bw.flush(); 
	}
}

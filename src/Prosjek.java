import java.util.Scanner;

//week3
/**
 * 
 * @author thyun.ahn
 * input[i] = (output[i]*i)-(intput[i-1]+...+input[1])
 *
 */
public class Prosjek {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] outputArry = new int[cnt+1];
		int[] inputArry = new int[cnt+1];
		
		for(int i=1; i<cnt+1; i++){
			outputArry[i] = sc.nextInt();
		}
		
		int inputSumBeforeIndex =0; 
		for(int i=1; i<cnt+1; i++){
			if(i==1){
				inputArry[i]=outputArry[i];
				inputSumBeforeIndex = outputArry[i];
			}else{
				inputArry[i] = (outputArry[i]*i)-(inputSumBeforeIndex);
				inputSumBeforeIndex+=inputArry[i];
			}
		}
		
		for(int i=1; i<cnt+1; i++){
			System.out.print(inputArry[i]+" ");
		}
		
		
	}
}

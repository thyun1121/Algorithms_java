package programmers;

import java.util.Arrays;

/**
 * 
 * @author thyun.ahn
 * 
 * Arrays.copyOfRange를 사용하면 쉽게 풀수 있었음..
 *
 */
public class KthNumber2 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
        int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
        System.out.println(commands[0][0]);
        int[] result = solution(array, commands);
        for (int i : result) {
            System.out.print(i);
        }
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] tempArry;
        int index = 0;
        for (int[] command : commands) {
            int j = 0;
            tempArry = new int[command[1] - command[0] + 1];
            for (int i = command[0] - 1; i <= command[1] - 1; i++) {
                tempArry[j] = array[i];
                // System.out.println(tempArry[j]);
                j++;
            }
            Arrays.sort(tempArry);
            answer[index] = tempArry[command[2] - 1];
            index++;
        }
        return answer;
    }

}

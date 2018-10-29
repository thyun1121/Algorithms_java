package algorithmsJobs;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Baseball {
    static class Pair {
        Pair(){
            ask = new int[3];
            answer = new int[2];
        }
        int[] ask; 
        int[] answer; //order : S, B
        boolean match(int[] numbers){
            int s = 0, b = 0;
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++){
                    if (numbers[i] == ask[j]){
                        if (i == j){
                            s++;
                        }
                        else {
                            b++;
                        }
                    }
                }
            boolean match = s == answer[0] && b == answer[1];
//          System.out.println("ask - " + Arrays.toString(ask) + 
//                  ", answer - " + Arrays.toString(answer) +
//                  ", numbers - " + Arrays.toString(numbers) 
//                  + ", s = " + s + ", b = " + b + ", match = " + match);
            return match;
        }

        @Override
        public String toString() {
            return "Pair [ask=" + Arrays.toString(ask) + ", answer="
                    + Arrays.toString(answer) + "]";
        }
    }

    Pair[] pairs;
    public void getValues(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        pairs = new Pair[n];
        for (int i = 0; i < n; i++){
            pairs[i] = new Pair();
            Pair pair = pairs[i];
            int[] ask = pair.ask;
            int[] answer = pair.answer;
            String askNo = scanner.next();
            for(int j=0; j<3; j++){
            	ask[j] = Integer.parseInt(""+askNo.charAt(j));
            }
            answer[0] = scanner.nextInt();
            answer[1] = scanner.nextInt();
        }

    }

    public List<int[]> solve(){
        List<int[]> matchNumbers = new ArrayList<>();
        int[] numbers = new int[3];
        for (numbers[0] = 1; numbers[0] < 10; numbers[0]++)
            for (numbers[1] = 1; numbers[1] < 10; numbers[1]++){
                if (numbers[1] == numbers[0])
                    continue;
                for (numbers[2] = 1; numbers[2] < 10; numbers[2]++){
                    if (numbers[2] == numbers[0] || numbers[2] == numbers[1])
                        continue;
                    if (testMatchAll(numbers)){
                        matchNumbers.add(Arrays.copyOf(numbers, 3));
                    }
                }
            }
        return matchNumbers;
    }

    private boolean testMatchAll(int[] numbers){
        for (Pair pair:pairs)
            if (!pair.match(numbers))
                return false;
        return true;
    }

    public static void main(String[] args){
        Baseball obj = new Baseball();
        obj.getValues();
        List<int[]> matchNumbers = obj.solve();
        System.out.println(matchNumbers.size());  
    }


}

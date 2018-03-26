package algorithmsMasterWeek1;
import java.util.PriorityQueue;

public class Prac5 {
	public static void main(String[] args) {
		int t = 5;
		int[] arry = {1,2,3,4,5,6,7,8,9};
		
		while(t>=0){
			int n=9, num;
			
			PriorityQueue<Integer> min_heap = new PriorityQueue<Integer>();
			PriorityQueue<Integer> max_heap = new PriorityQueue<Integer>();
			
			for(int i=1; i<=n; i++){
				num = arry[i-1];
				if(max_heap.size() == min_heap.size()){
					if(min_heap.isEmpty()){
						max_heap.offer(num);
					}else{
						if(min_heap.peek() <= num){
							int temp = min_heap.peek();
							min_heap.poll();
							min_heap.offer(num);
							num = temp;
						}
						max_heap.offer(num);
					}
				}else{
					if(max_heap.peek() > num){
						int temp = max_heap.peek();
						max_heap.poll();
						max_heap.offer(num);
						num = temp;
					}
					min_heap.offer(num);
				}
				
				System.out.println(max_heap.peek());
			}
		}
	}
}

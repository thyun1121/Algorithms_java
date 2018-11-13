package algorithmsMasterWeek1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

//해결
/**
 * priority queue
 * poll : top element를 꺼내는 메소드
 * peek : top element를 꺼내지는 않고 확인하는 메소드
 * 
 * offer vs. add
 * https://stackoverflow.com/questions/2703984/what-is-the-difference-between-the-add-and-offer-methods-in-a-queue-in-java
 * priority queue는 insertion 제약이 없기에 두 가지는 동일하지만, ArrayBlockingQueue는 queue가 어떻게 인스턴스화 되었는지에 따라, offer add 가 다르게 동작한다고 함.
 * 
 * min_heap
 *  
 * @author thyun.ahn
 *
 */
public class Prac5 {
	public static void main(String[] args) {
		int N = 23;
		int[] num = {23,41,13,22,-3,24,-31,-11,-8,-7,3,5,103,211,-311,-45, -67,-73,-81, -99, -33, 24, 56};
		ArrayList<Integer> median = new ArrayList<Integer>();
		
			
		PriorityQueue<Integer> min_heap = new PriorityQueue<Integer>();		//default constructor : minheap
		PriorityQueue<Integer> max_heap = new PriorityQueue<Integer>(Collections.reverseOrder());		//maxheap
		
		for(int i=0; i<N; i++){
			if(max_heap.isEmpty() || max_heap.peek()>num[i]){		//maxheap을 기준으로 maxheap보다 작으면 maxheap에 넣는다.
				max_heap.offer(num[i]);
			}else{
				min_heap.offer(num[i]);
			}
			
			if(max_heap.size() > min_heap.size()+1){
				min_heap.offer(max_heap.peek());
				max_heap.poll();
			}
			
			if(min_heap.size() > max_heap.size()){
				max_heap.offer(min_heap.peek());
				min_heap.poll();
			}
			
			if(i%2==0)
				median.add(max_heap.peek());		
		}
		
		for(int i=0; i<median.size(); i++){
			System.out.print(median.get(i)+" ");
		}
		median.clear();
		
	}
}

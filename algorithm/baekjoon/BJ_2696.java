package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

//findMedian
public class BJ_2696 {
	public static PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
	public static PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
	public static ArrayList<Integer> al = new ArrayList<Integer>();
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inputNums;
		
		int testCase = sc.nextInt();
		for(int i=0; i<testCase; i++){
			
			int inputLength = sc.nextInt();
			inputNums = new int[inputLength];
			
			for(int j=0; j<inputLength; j++){
				inputNums[j] = sc.nextInt();
			}			
			
			for(int k=0; k<inputLength; k++){
				if(maxHeap.size()==0 || maxHeap.peek()>inputNums[k])
					maxHeap.add(inputNums[k]);
				if(maxHeap.peek()<inputNums[k])
					minHeap.add(inputNums[k]);
				
				if(maxHeap.size()>minHeap.size()+1){
					minHeap.add(maxHeap.peek());
					maxHeap.poll();
				}
				
				if(maxHeap.size()<minHeap.size()){
					maxHeap.add(minHeap.peek());
					minHeap.poll();
				}
				
				if(k%2==0)
					al.add(maxHeap.peek());					
			}
			
			//System.out.println(al.size());
			sb.append(al.size());
			for(int l=0; l<al.size(); l++){
				//System.out.print(rslt+" ");
				if(l%10==0){
					sb.append("\r\n");
				}
				sb.append(al.get(l)+" ");
					
			}
			//System.out.println();
			if(i!=testCase-1){
				sb.append("\r\n");
			}
			
			al.clear();
			maxHeap.clear();
			minHeap.clear();			
		}
		System.out.println(sb);
	}
}

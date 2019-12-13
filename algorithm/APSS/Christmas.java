package APSS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Christmas {
	private int boxs;		// 박스 수.
	private int kids;		// 아이들 수.
	private int[] items;	// box 안의 선물 수.
	private int[] pSums;	// 부분합 배열.

	// Setting inputs
	public void setInput(Scanner input){
		this.boxs = input.nextInt();
		this.kids = input.nextInt();

		items = new int[this.boxs];
		for(int j=0; j<this.boxs; j++)
			items[j] = input.nextInt();
		
	}

	// set Partial Sum
	public void setPsum(){
		pSums = new int [this.boxs+1];		//0이 들어있는 index를 0번째에 추가하므로 +1한다.
		pSums[0] = 0;
		for(int i=1; i<pSums.length; i++){
			pSums[i] = (pSums[i-1]+items[i-1])%kids;
		}
	}

	// Setting arrayList
	public ArrayList<Integer> setList(int initialVal){
		Integer [] arr = new Integer[this.kids];
		ArrayList<Integer> arryList= new ArrayList<>(Arrays.asList(arr));
		Collections.fill(arryList, initialVal);
		return arryList;
	}


	// 구입할 수 있는 경우의 수
	public int buyCase(){
		this.setPsum();	// 부분합 배열 set
		ArrayList<Integer> sameNumList = this.setList(0);

		for(int i=0; i<pSums.length; i++)
			sameNumList.set(pSums[i], sameNumList.get(pSums[i])+1);		//kids로 나눈 나머지 값의 동일한 개수.

		int ret=0;
		for(int i=0; i<sameNumList.size(); i++){
			if(sameNumList.get(i) >= 2)
				ret += ((sameNumList.get(i) * (sameNumList.get(i) - 1)) / 2) ;
		}

		return ret;
	}


	// 중복없이 최대 구매 수.
	// * 1번째 box도 살수 있음을 유의.
	public int buyMax(){
		ArrayList<Integer> lastNumList = this.setList(-1);		//kids 수만큼
		int[] ret = new int[pSums.length];

		// i=1부터 하지 않은 경우는 index가 1인  상품을 못사기 때문. (2번째 케이스는 1번 index 상품을 살 수 있음)
		// i=1부터 해버리면 lastNumList가 -1값으로 계속 초기화 상태이기 때문에 1번 index룰 구매할 수 없음.
		for(int i=0; i<pSums.length; i++){
			int beginIndex = lastNumList.get(pSums[i]);

			if(beginIndex > -1)				// i를 사는 경우, (이미 똑같은 숫자를 본 상태이니까 )
				ret[i] = Math.max(ret[i-1], ret[beginIndex]+1);	//begin+1~현 index까지 사는 개수 (1번) + begin까지의 구매 가능했던 수.
			else							// i를 못 사는 경우,
				ret[i] = (i>0) ? ret[i-1] : 0 ;

			lastNumList.set(pSums[i], i);	// 나머지 값의 마지막 위치를 담는 arrayList.
		}
		return ret[pSums.length-1];
	}


	// MAIN
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Christmas ch = new Christmas();
		
		int caseCnt = scn.nextInt();		// case 수.

		for(int i=0; i<caseCnt; i++){
			ch.setInput(scn);	// setting input.
	
			int rslt1 = ch.buyCase();		// #1
			int rslt2 = ch.buyMax();		// #2
	
			System.out.println(rslt1+" "+rslt2);
		}	
	}

	// Print inputs
	public void printArrayOrList(int[] paramArrays){
		for(int i=0; i<paramArrays.length; i++){
				System.out.print(paramArrays[i]+" ");
		}
	}

}

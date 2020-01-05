package APSS.partialSum;

public class PartialSumVariance {
	private int[] scores = {100, 97, 86, 79, 66, 52, 49, 42, 41};
	private int[] pSums;
	private int[] sqPSums;
	
	// Set 부분합 & 부분합 제곱.
	private void setPsum (){
		// set 부분합.
		pSums = new int[scores.length];
		pSums[0] = scores[0];
		for(int i=1; i<scores.length; i++){
			pSums[i] = scores[i]+pSums[i-1];
		}
		
		// set 부분합제곱.
		sqPSums = new int[pSums.length];
		sqPSums[0] = scores[0]*scores[0];
		for(int i=1; i<pSums.length; i++){
			sqPSums[i] = (scores[i]*scores[i])+sqPSums[i-1];
		}	
		
	}
	
	private int getPsum(String flag, int start, int end){
		int rslt = 0;
		int[] paramArry = new int [scores.length]; 
		
		switch(flag){
			case "pSums":
				paramArry = pSums;
				break;
			case "sqPSums":
				paramArry = sqPSums;
				break;
		}
		
		if(start==0)	rslt = paramArry[end];
		else	rslt = paramArry[end]-paramArry[start-1];
		return rslt;
	}
	
	private double getVariance(int start, int end){
		double pSumVal = getPsum("pSums", start, end);
		double mean = pSumVal / (end-start+1) ;
		double ret = (getPsum("sqPSums", start, end) - 2*mean*pSumVal + (end-start+1)*mean*mean) / (end-start+1); 
		return ret;
	}
	
	
	
	public static void main(String[] args) {
		PartialSumVariance psv = new PartialSumVariance();
		psv.setPsum();
		System.out.println(psv.getVariance(0,3));
		
	}

}
package APSS;

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
		for(int i=0; i<pSums.length; i++){
			sqPSums[i] = pSums[i]*pSums[i];
		}	
		
	}
	
	private double getVariance(int start, int end){
		double ret = 0.0;
		
		return ret;
	}
	
	
	
	public static void main(String[] args) {
		PartialSumVariance psv = new PartialSumVariance();
		psv.setPsum();
		psv.getVariance(1,4);
		
	}

}
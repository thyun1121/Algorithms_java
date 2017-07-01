package Sort;

public class MergeSort {
	
	public static void main(String[] args) {
		//char[] str = {'A','G','L','O','R','H','I','M','S','T'};
		char[] str = {'A','L','G','O','R','I','T','H','M','S'};
		int begin = 0;
		int end = str.length-1;
				
		mergeSort(str, begin, end);
	}
	
	public static void mergeSort(char[] s, int begin, int end){
		if(begin < end){
			int middle = (begin+end)/2;
			mergeSort(s, begin, middle);
			mergeSort(s, middle+1, end);
			System.out.println(merge(s, begin, middle, end));
		}		
	}
	
	
	public static char[] merge(char[] s, int begin, int middle, int end){
		int i=begin, j=middle+1, k=begin;
		
		char[] tmp = new char[s.length] ;
		
		while(i<=middle && j<=end){
			if(s[i] <= s[j]){
				tmp[k++] = s[i++]; 
			}else{
				tmp[k++] = s[j++];
			}
		}
		
		while(i<=middle){
			tmp[k++]=s[i++];
		}
		
		while(j<=end){
			tmp[k++] =s[j++];
		}
		
		for(int l=begin; l<=end; l++){
			s[l] = tmp[l];
		}
		
		return s;
	}
}

package algorithmsJobs.course4;
import java.util.Scanner;
/**
 * 
 * @author thyun.ahn
 * 
 * 1. deepcopy 필요.. 하지 않으면 변경된 arry로 나중에 작업하게 됨.
 * 2. 처음에는 모든 숫자와 냅킨을 담는 arrayList를 만들고, deepcopy 하는 방식으로 구현하였더니
 * 아무래도 숫자마다 parseInt()를 해서인지 마지막 테스트케이스 15에서 계속 time limited 나옴.
 * ==> 대안으로,
 * 숫자와 냅킨 배열을 각각 생성 후  deepcopy하여 복사본 생성.
 * 그리고 .변환은 바로바로 냅킨 복사본 배열에 적용함.
 * 합이 0 여부 체크도 하나의 큰 arrayList/arry가 아닌 숫자와 냅킨 배열의 각각의 값으로 산수함.
 *
 */
public class Dessert {
	public static String[] napkinArry = {"+","-","."};
	//public static List<String> napkinResultList = new ArrayList<String>();
	public static String[] napkinResultArry;
	public static int cnt = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		napkinResultArry = new String[N-1];
		int index = 0;
		testNapkinRecursionRefactor(N, 0, index);
		//testNapkinRecursion(N, 0, index);
		//arryRecursion(N,0, index);
		System.out.println(cnt);
	}
	
//	public static void arryRecursion(int N, int arryIndex,  int index){
//		if(arryIndex==N-1){
//			for(String s : napkinResultArry){
//				System.out.print(s);
//			}
//			System.out.println();
//			return;
//		}
//		for(int i=index; i<napkinArry.length; i++){
//			napkinResultArry[arryIndex] = napkinArry[i];
//			arryRecursion(N, arryIndex+1, index);
//		}
//	}
	
	
	
//	public static void testNapkinRecursion(int N, int arryIndex, int index){
//		//냅킨은 숫자 사이에 있으므로, 실제 입력 수보다 한개 더 적다.
//		if(arryIndex==N-1){	
//			String[] calcArry = new String[2*N-1];	//숫자와 냅킨이 모두 들어가는 arry
//            String str = "";
//            int allDataIndex = 0;
//            for(int i=0; i<N; i++){
//                str+=(i+1)+" ";
//                allDataIndex = 2*i;
//                calcArry[allDataIndex] = ""+(i+1);//String.valueOf((i+1));	//숫자 대입.
//                if(i<N-1){
//                    str+=napkinResultArry[i]+" ";
//                    calcArry[allDataIndex+1] = napkinResultArry[i]; //필요한 수만큼의 냅킨 데이터 대입.
//                }
//            }
//            if(calcList(calcArry)==0){
//            	if(cnt<20)
//            		System.out.println(str);
//                cnt++;
//            }
//            return;
//		}
//		
//		for(int i=index; i<napkinArry.length; i++){
//			napkinResultArry[arryIndex] = (napkinArry[i]);
//			testNapkinRecursion(N, arryIndex+1, index);	
//		}
//	}
	
	
	public static String[] copyArryDataDeeply (String[] originArry){
		String[] tempArry = new String[originArry.length];
		for(int i=0; i<originArry.length; i++){
			tempArry[i] = originArry[i]; 
		}
		return tempArry;
	}
	
	public static int[] copyArryDataDeeply (int[] originArry){
		int[] tempArry = new int[originArry.length];
		for(int i=0; i<originArry.length; i++){
			tempArry[i] = originArry[i]; 
		}
		return tempArry;
	}
	
	public static void testNapkinRecursionRefactor(int N, int arryIndex, int index){
		//냅킨은 숫자 사이에 있으므로, 실제 입력 수보다 한개 더 적다.
		if(N<=2)
			return;
		
		if(arryIndex==N-1){	
			int[] numResultArry = new int[N]; 
            //String str = "";
			StringBuilder str = new StringBuilder();
            for(int i=0; i<N; i++){
                numResultArry[i] = i+1;
            }
            
            if(calcListRefactor(N, numResultArry, napkinResultArry, str)==0){
            	if(cnt<20)
            		System.out.println(str);
                cnt++;
            }
            return;
		}
		
		for(int i=index; i<napkinArry.length; i++){
			napkinResultArry[arryIndex] = (napkinArry[i]);
			testNapkinRecursionRefactor(N, arryIndex+1, index);	
		}
	}
	
	
	public static int calcListRefactor(int N, int[] numResultArry, String[] napkinResultArry, StringBuilder str ){
		String[] tempArry = copyArryDataDeeply(napkinResultArry);
		int[] tempNumArry = copyArryDataDeeply(numResultArry);
		
		String operand = "+";
		int sum=0;
		for(int i=0; i<tempArry.length; i++){
			if( (".".equals(tempArry[i])) ){
				int beforeIndex = tempNumArry[i];
				int afterIndex = tempNumArry[i+1];
				if(afterIndex<10){
					afterIndex = (beforeIndex*10)+afterIndex;
				}else{
					afterIndex = (beforeIndex*100)+afterIndex;
				}
				tempNumArry[i]=0;
				tempNumArry[i+1]=afterIndex;
				if(i==0){
					tempArry[i] = "+";
				}else{
					tempArry[i] = tempArry[i-1];
				}
			}
		}
		
		sum+=tempNumArry[0];
		for(int i=0;i<tempArry.length; i++){
			if("+".equals(tempArry[i]) ){
				sum+=tempNumArry[i+1];
			}else if("-".equals(tempArry[i])){
				sum-=tempNumArry[i+1];
			}
		}
		
		if(sum==0){
			for(int i=0; i<numResultArry.length; i++){
				str.append(""+numResultArry[i]+" ");
				if(i<=napkinResultArry.length-1)
					str.append(napkinResultArry[i]+" ");
			}
		}
			
		return sum;	
		
		
		
//		for(int i=0; i<napkinResultArry.length; i++){
//			if( (".".equals(napkinResultArry[i])) ){
//				int beforeIndex = numResultArry[i];
//				int afterIndex = numResultArry[i+1];
//				if(afterIndex<10){
//					afterIndex = (beforeIndex*10)+afterIndex;
//				}else{
//					afterIndex = (beforeIndex*100)+afterIndex;
//				}
//				tempArry[2*i] = "0";
//				tempArry[2*i+1] = operand;
//				tempArry[2*i+2] = ""+afterIndex;	//String.valueOf(afterIndex);
//			}else if( "+".equals(napkinResultArry[i]) || "-".equals(napkinResultArry[i]) ){
//				if(tempArry[2*i]==null)
//					tempArry[2*i] = ""+numResultArry[i];
//				tempArry[2*i+1] = napkinResultArry[i];
//				tempArry[2*i+2] = ""+numResultArry[i+1];
//				operand = napkinResultArry[i];
//			}
//		}
//		//tempArry[tempArry.length-1] = ""+numResultArry[numResultArry.length-1];
//		
//		1 - 0 - 23 - 4 
//		
//		int sum = 0;
//		int preNum = 0;
//		operand = "+";
//		for(int i=0; i<tempArry.length; i++){
//			String val = tempArry[i];
//			switch(val){
//			case "+":
//				operand = val;
//				break;
//			case "-":
//				operand = val;
//				break;
//			default :
//				preNum = Integer.parseInt(val);
//				if("-".equals(operand))	sum-=preNum;
//				if("+".equals(operand)) sum+=preNum;				
//			}
//		}
		
		
	}
	
	
//	public static int calcList(String[] calcArry){
//		String[] tempArry = copyArryDataDeeply(calcArry);
//		String operand = "+";
//		for(int i=0; i<calcArry.length; i++){
//			if(".".equals(calcArry[i])){
//				int beforeIndex = Integer.parseInt(tempArry[i-1]);
//				int afterIndex = Integer.parseInt(tempArry[i+1]);
//				if(afterIndex<10){
//					afterIndex = (beforeIndex*10)+afterIndex;
//				}else{
//					afterIndex = (beforeIndex*100)+afterIndex;
//				}
//				tempArry[i-1] = "0";
//				tempArry[i] = operand;
//				tempArry[i+1] = ""+afterIndex;	//String.valueOf(afterIndex);
//			}else if( "+".equals(calcArry[i]) || "-".equals(calcArry[i]) ){
//				operand = calcArry[i];
//			}
//		}
//		
//		
//		int sum = 0;
//		int preNum = 0;
//		operand = "+";
//		for(int i=0; i<tempArry.length; i++){
//			String val = tempArry[i];
//			switch(val){
//			case "+":
//				operand = val;
//				break;
//			case "-":
//				operand = val;
//				break;
//			default :
//				preNum = Integer.parseInt(val);
//				if("-".equals(operand))	sum-=preNum;
//				if("+".equals(operand)) sum+=preNum;				
//			}
//		}
//		return sum;
//	}
}

package algorithmsJobs;
import java.util.Scanner;
 
//let's see right side of arryMap.
public class Seat {
    enum Type{
        RIGHT, DOWN, LEFT, UP
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();         //row
        int R = sc.nextInt();         //col
        
        int[][] arrySeat = new int[C][R];
        Type direction = Type.RIGHT;
        int arryVal = 1;
        int i=0;
        int j=0;
        arrySeat[i][j] = arryVal;
        
        while(arryVal<(C*R)) {
            switch(direction){
                case RIGHT:
                    if(j+1>R-1 || arrySeat[i][j+1]>0) {
                        direction = Type.DOWN;
                    }else {
                        arryVal++;
                        arrySeat[i][j+1]=arryVal;                
                        j++;
                    }    
                    break;
                case DOWN:
                    if(i+1>C-1 || arrySeat[i+1][j]>0) 
                        direction = Type.LEFT;
                    else {
                        arryVal++;
                        arrySeat[i+1][j]=arryVal;                
                        i++;
                    }
                    break;
                case LEFT:
                    if(j-1<0 || arrySeat[i][j-1]>0) 
                        direction = Type.UP;
                    else {
                        arryVal++;
                        arrySeat[i][j-1]=arryVal;                
                        j--;
                    }
                    break;
                case UP:
                    if(i-1<0 || arrySeat[i-1][j]>0) 
                        direction = Type.RIGHT;
                    else {
                        arryVal++;
                        arrySeat[i-1][j]=arryVal;                
                        i--;
                    }
                    break;
            }
        }
        
//        for(int k=0; k<C; k++) {
//            for(int l=0; l<R; l++) {
//                System.out.print(arrySeat[k][l]+" ");
//            }
//            System.out.println();
//        }
        int waitNo = sc.nextInt();
        if(waitNo>C*R){
        	System.out.println(0);
        }else{
        	for(int k=0; k<C; k++) {
                for(int l=0; l<R; l++) {
                    if(arrySeat[k][l]==waitNo)
                        System.out.print((k+1)+" "+(l+1));
                }
            }
        }
        
    }
}
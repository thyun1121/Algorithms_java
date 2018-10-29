package algorithmsJobs;
import java.util.Scanner;
 
 
 
public class Offset {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        String[][] cube = new String[7][7];
        
        
        for(int i=0; i<7; i++) {
            for(int j=0; j<7; j++) {
                cube[i][j] = "10";
            }
        }
 
        for(int i=1; i<6; i++){                //insert Array
            for(int j=1; j<6; j++){
                cube[i][j] = sc.next();                
            }
        }
        
        for(int i=1; i<6; i++){                //check elements
            for(int j=1; j<6; j++){
                if(Integer.parseInt(cube[i][j])<Integer.parseInt(cube[i-1][j] )
                        && Integer.parseInt(cube[i][j])<Integer.parseInt(cube[i+1][j])                  
                        && Integer.parseInt(cube[i][j])<Integer.parseInt(cube[i][j-1]) 
                        && Integer.parseInt(cube[i][j])<Integer.parseInt(cube[i][j+1])) {
                    cube[i][j] = "-1";
                }
            }
        }
        
        
        for(int i=1; i<6; i++){                
            for(int j=1; j<6; j++){
                if("-1".equals(cube[i][j])) {
                    cube[i][j] = "*";
                }
                System.out.print(cube[i][j]+" "); 
            }
            System.out.println();
        }    
    }
}
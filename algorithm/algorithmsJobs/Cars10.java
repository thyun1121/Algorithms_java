package algorithmsJobs;


import java.util.Scanner;

public class Cars10 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int findCars = 0;
		
		for(int i=0; i<5; i++){
			if(day==sc.nextInt())
				findCars++;
		}
		
		System.out.println(findCars);

	}

}

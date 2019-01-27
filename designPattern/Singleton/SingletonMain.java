package Singleton;

public class SingletonMain {
	public static void main(String[] args) {
		Something sm1 = Something.getInstance();
		Something sm2 = Something.getInstance();
		
		System.out.println(sm1==sm2);	//true	
	}
}

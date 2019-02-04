package Singleton;

public class SingletonMain2 {
	public static void main(String[] args) {
		Something2 sm = Something2.getInstance();
		Something2 sm2 = Something2.getInstance();
		System.out.println(sm==sm2);
	}
}

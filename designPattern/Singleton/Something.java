package Singleton;

//holder안에 선언된 instance가 static이기 때문에 클래스 로딩시점에 한번만 호출될 것이며 
//final을 사용해 다시 값이 할당되지 않도록 만든 방법.
public class Something {
	private Something(){
		
	}
	private static final class LazyHolder {
		private static final Something Instance = new Something();
	}
	
	public static Something getInstance(){
		return LazyHolder.Instance;
	}
	
}
package SingletonDesignPattern;

public class SingletonObjectClass {

	private static SingletonObjectClass singleObj = new SingletonObjectClass();
	
	private SingletonObjectClass() {
		System.out.println("singleton private cotr");
	}
	
	public static SingletonObjectClass getInstance() {
		return singleObj;
	}
	
	public void showMsg() {
		System.out.println("This msg is shown");
	}
	
}

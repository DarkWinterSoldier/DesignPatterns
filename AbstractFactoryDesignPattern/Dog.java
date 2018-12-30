package AbstractFactoryDesignPattern;

public class Dog implements Animal {

	@Override
	public void myName() {
		System.out.println("My name is Tom the dog");
	}

	Dog(){
		System.out.println("ctor of Dog");
	}
}

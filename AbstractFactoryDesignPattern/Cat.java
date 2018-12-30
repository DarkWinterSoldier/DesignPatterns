package AbstractFactoryDesignPattern;

public class Cat implements Animal {

	@Override
	public void myName() {
		System.out.println("My name is Jin the Cat");
	}

	Cat(){
		System.out.println("Cat yaar");
	}
}

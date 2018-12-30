package FactoryDesignPattern;

public class TestMain {

	public static void main(String[] args) {
		String s= "cat";
		AnimalFactory fact = new AnimalFactory();
		
		
		Animal an = fact.getAnimalType(s);
		an.myName();

	}

}

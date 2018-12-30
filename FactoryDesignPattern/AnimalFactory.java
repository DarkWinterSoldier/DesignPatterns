package FactoryDesignPattern;

public class AnimalFactory {
	
	Animal getAnimalType(String ani) {
		if(ani.equalsIgnoreCase("DOG")) {
			return new Dog();
		}
		else if (ani.equalsIgnoreCase("CAT")) {
			return new Cat();
		}
		return null;
		
	}

}

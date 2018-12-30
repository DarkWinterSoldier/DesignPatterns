package AbstractFactoryDesignPattern;

public class AnimalFactory extends AbstractFactoryClass {
	
	Animal getAnimalType(String ani) {
		if(ani.equalsIgnoreCase("DOG")) {
			return new Dog();
		}
		else if (ani.equalsIgnoreCase("CAT")) {
			return new Cat();
		}
		return null;
		
	}

	@Override
	Size getSize(String size) {
		// TODO Auto-generated method stub
		return null;
	}

}

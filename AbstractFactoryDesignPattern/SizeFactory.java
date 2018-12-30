package AbstractFactoryDesignPattern;

public class SizeFactory extends AbstractFactoryClass{

	@Override
	Animal getAnimalType(String animal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Size getSize(String size) {
		if(size.equalsIgnoreCase("BIG")) {
			return new Big();
		}
		else if (size.equalsIgnoreCase("SMALL")) {
			return new Small();
			
		}
		return null;
	}

}

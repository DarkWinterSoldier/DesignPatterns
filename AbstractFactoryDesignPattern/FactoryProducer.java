package AbstractFactoryDesignPattern;

public class FactoryProducer {

	public AbstractFactoryClass getFactoryType(String factory) {
		if (factory.equalsIgnoreCase("Animal")) {
			return new AnimalFactory();
		}
		else if (factory.equalsIgnoreCase("Size")) {
			return new SizeFactory();
		}
		
		return null;
	}
	
}

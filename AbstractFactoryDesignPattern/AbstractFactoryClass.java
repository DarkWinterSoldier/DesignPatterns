package AbstractFactoryDesignPattern;

public abstract class AbstractFactoryClass {

	abstract Animal getAnimalType(String animal);
	abstract Size getSize(String size);
}

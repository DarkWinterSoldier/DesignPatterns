package AbstractFactoryDesignPattern;

public class AbstractFactoryTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String teststring = "Size";
		FactoryProducer fp = new FactoryProducer();
		AbstractFactoryClass abs = fp.getFactoryType(teststring);
		Size size = abs.getSize("small");
		size.mySize();

	}
	
}

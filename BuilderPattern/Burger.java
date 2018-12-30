package BuilderPattern;

public abstract class Burger implements Item {

	@Override
	public Packing getPacking() {
		
		return new Wrapper();
	}

	@Override
	public abstract double price() ;
}

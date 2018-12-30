package BuilderPattern;

public abstract class ColdDrink implements Item {


	@Override
	public Packing getPacking() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	@Override
	public abstract double price() ;

}

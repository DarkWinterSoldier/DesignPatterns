package BuilderPattern;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealBuilder builder = new MealBuilder();
		Meal m = builder.ChickenBurgerWithPepsi();
		m.showItems();
		System.out.println(m.getCost());
		
	}

}

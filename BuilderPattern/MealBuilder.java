package BuilderPattern;

public class MealBuilder {
	
	public Meal VegBurgerWithCoke() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	

	public Meal ChickenBurgerWithPepsi() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
	
}

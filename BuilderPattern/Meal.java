package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item e) {
		items.add(e);
	}
	
	
	public double getCost() {
		double cost = 0.0;
		for(Item it : items) {
			cost+=it.price();
		}
		return cost;
	}
	
	public void showItems() {
		for(Item it : items) {
		System.out.print("Item name : "+it.name());
		System.out.print(" Item packing : "+it.getPacking().pack());
		System.out.println(" Item price : "+it.price());
		}
	}
}

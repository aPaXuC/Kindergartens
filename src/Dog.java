import java.util.PrimitiveIterator.OfDouble;

public class Dog extends Animal {
	
	private String name;
	private String color;
	private boolean isHungry;
	
	public Dog(String name, String color, boolean isHungry) {
		super();
		this.name = name;
		this.color = color;
		this.isHungry = isHungry;
	}
	
	public boolean catchACat(Cat cat) {
		if (cat == null) 
			return false;
		if (isHungry && !cat.isVegetarian()) {
			cat.soulLoss();
			return true;
		}
		return false;
	}
	
	
}

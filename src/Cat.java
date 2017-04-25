public class Cat extends Animal {

	private String color;
	private int soulsLeft;

	public Cat(boolean veg, String food, int legs) {
		super(veg, food, legs);
		this.color = "White";
		this.soulsLeft = 9;
	}

	public Cat(boolean veg, String food, int legs, String color) {
		super(veg, food, legs);
		this.color = color;
		this.soulsLeft = 9;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSoulsLeft() {
		return soulsLeft;
	}

	public void setSoulsLeft(int soulsLeft) {
		this.soulsLeft = soulsLeft;
	}

	public int soulLoss() {
		if (getSoulsLeft() > 0) {
			setSoulsLeft(getSoulsLeft() - 1);
		}
		return getSoulsLeft();
	}
}
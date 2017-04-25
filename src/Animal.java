 public class Animal {
 
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;
 
    public Animal(){}
 
    public Animal(boolean veg, String food, int legs){
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
    }
 
    public boolean isVegetarian() {
        return vegetarian;
    }
 
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
 
    public String getEats() {
        return eats;
    }
 
    public void setEats(String eats) {
        this.eats = eats;
    }
 
    public int getNoOfLegs() {
        return noOfLegs;
    }
 
    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eats == null) ? 0 : eats.hashCode());
		result = prime * result + noOfLegs;
		result = prime * result + (vegetarian ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (eats == null) {
			if (other.eats != null)
				return false;
		} else if (!eats.equals(other.eats))
			return false;
		if (noOfLegs != other.noOfLegs)
			return false;
		if (vegetarian != other.vegetarian)
			return false;
		return true;
	}
    
 
}
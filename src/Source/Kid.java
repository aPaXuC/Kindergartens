package Source;

public class Kid {

	private E_Names name;
	
	public Kid() {
		name = E_Names.getRandomName();
	}

	@Override
	public String toString() {
		return "Kid [name=" + name + "]";
	}
	
}

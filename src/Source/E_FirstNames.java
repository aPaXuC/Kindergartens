package Source;

public enum E_FirstNames {

	Moshe("Moshe"), Shalom("Shalom"), Itzik("Itzik"), Rachel("Rachel"), Sivan("Sivan");
	
	private String name;
	
	E_FirstNames(String _name) {
		this.name = _name;
	}
	
	public static E_FirstNames getRandomFirstName() {
		return E_FirstNames.values()[(int) (Math.random()*E_FirstNames.values().length)];
	}
}

package Source;

public enum E_Names {

	Moshe("Moshe"), Shalom("Shalom"), Itzik("Itzik"), Rachel("Rachel"), Sivan("Sivan");
	
	private String name;
	
	E_Names(String _name) {
		this.name = _name;
	}
	
	public static E_Names getRandomName() {
		return E_Names.values()[(int) (Math.random()*E_Names.values().length)];
	}
}

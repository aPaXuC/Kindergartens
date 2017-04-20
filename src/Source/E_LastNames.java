package Source;

public enum E_LastNames {

	Cohen("Cohen"), Levi("Levi"), Davidov("Davidov"), Azulay("Azulay"), Tal("Tal");
	
	private String name;
	
	E_LastNames(String _name) {
		this.name = _name;
	}
	
	public static E_LastNames getRandomLastName() {
		return E_LastNames.values()[(int) (Math.random()*E_LastNames.values().length)];
	}
}

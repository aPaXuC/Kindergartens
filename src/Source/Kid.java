package Source;

public class Kid extends Person {

	private int kgId;
	private int classID;

	public Kid() {
		super(E_FirstNames.getRandomFirstName(), E_LastNames.getRandomLastName());
		kgId = -1;
		classID = -1;
	}

	public int getKgId() {
		return kgId;
	}

	public int getClassID() {
		return classID;
	}

	public void setKgAndClassNumbers(int _kgID, int _classID) {
		this.kgId = _kgID;
		this.classID = _classID;
	}

	@Override
	public String toString() {
		return "Kid [name= " + getFirstName() + " " + getLastName() + "]";
	}

}

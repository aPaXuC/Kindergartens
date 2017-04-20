package Source;

import java.util.ArrayList;

class KgClass {

	private int classNum;
	private ArrayList<Kid> kids;
	private static final int MAX_CAPACITY = 5;
	
	public KgClass(int classNum) {
		this.classNum = classNum;
		kids = new ArrayList<>();
	}

	public boolean addKid(Kid kidToAdd) {
		if (kids.size() < MAX_CAPACITY)
			return kids.add(kidToAdd);
		return false;
	}
	
	@Override
	public String toString() {
		return "\n\t\tKgClass [classNum=" + classNum + " numOfKids=" + kids.size() + " names=" + kids.toString() + "]";
	}
	
}

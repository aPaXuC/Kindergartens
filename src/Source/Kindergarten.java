package Source;

import java.util.Arrays;

public class Kindergarten {

	private static int nextID;
	
	private int kgID;
	private KgClass[] classes;

	public Kindergarten(int numOfClasses) {
		classes = new KgClass[numOfClasses];
		kgID = ++nextID;
		
		for (int i = 0; i < numOfClasses; i++)
			classes[i] = new KgClass(i+1);
	}

	public boolean addKid(Kid kidToAdd) {
		for (KgClass cl : classes)
			if (cl.addKid(kidToAdd)) {
				kidToAdd.setKgAndClassNumbers(kgID, cl.getClassNum());
				return true;
			}
		return false;
	}
	
	@Override
	public String toString() {
		return "Kindergarten [kgID=" + kgID + ", classes=" + Arrays.toString(classes) + "]";
	}
	
}

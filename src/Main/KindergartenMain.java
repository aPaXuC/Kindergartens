package Main;

import java.util.ArrayList;

import Source.Kid;
import Source.Kindergarten;

public class KindergartenMain {

	static ArrayList<Kindergarten> kg;
	static ArrayList<Kid> kids;
	
	public static void main(String[] args) {
		kg = new ArrayList<>();
		kids = new ArrayList<>();
		kg.add(new Kindergarten(2));
		kg.add(new Kindergarten(5));
		
		for (int i = 0; i < 50; i++)
			addKid();
		
		for (Kindergarten kin : kg)
			System.out.println(kin.toString());

		System.out.println("\n===========================\n\tKids Status\n===========================\n");
		
		for (Kid k : kids)
			System.out.println(k.getFirstName() + " " + k.getLastName() + (k.getClassID() == -1 ? " not in a class yet :(" : " in Kindergarten " + k.getKgId() + " class " + k.getClassID()));
		
	}
	
	static void addKid() {
		Kid kidToAdd = new Kid();
		kids.add(kidToAdd);
		for (Kindergarten kinG : kg)
			if (kinG.addKid(kidToAdd))
				return;
	}

}

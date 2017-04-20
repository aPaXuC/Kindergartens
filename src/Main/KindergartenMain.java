package Main;

import java.util.ArrayList;

import Source.Kid;
import Source.Kindergarten;

public class KindergartenMain {

	static ArrayList<Kindergarten> kg;
	
	public static void main(String[] args) {
		kg = new ArrayList<>();
		kg.add(new Kindergarten(2));
		kg.add(new Kindergarten(5));
		
		for (int i = 0; i < 50; i++)
			addKid();
		
		for (Kindergarten kin : kg)
			System.out.println(kin.toString());

	}
	
	static void addKid() {
		Kid kidToAdd = new Kid();
		for (Kindergarten kinG : kg)
			if (kinG.addKid(kidToAdd))
				return;
	}

}

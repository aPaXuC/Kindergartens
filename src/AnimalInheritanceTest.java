import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AnimalInheritanceTest {

	@Test
	public void test() {
		
		ArrayList<Animal> cats = new ArrayList<>();
		Dog dog = new Dog("rexi", "black", true);
		assertTrue(cats.add(new Cat(false, "milk", 4, "black")));
        assertTrue(cats.get(0) instanceof Animal);
		assertTrue(cats.add(new Cat(false, "milk", 4, "white")));
        assertTrue(cats.get(1) instanceof Cat);
		assertTrue(cats.add(new Cat(false, "milk", 4, "brown")));
        assertFalse(cats.get(2) instanceof Dog);
        for (Animal c : cats) {
        	assertTrue(dog.catchACat((Cat)c));
        	assertEquals(((Cat) c).getSoulsLeft(), 8);
		}
	}

}

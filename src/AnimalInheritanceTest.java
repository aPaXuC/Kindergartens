import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalInheritanceTest {

	@Test
	public void test() {
		
		Dog dog = new Dog("rexi", color, isHungry)
        Cat cat1 = new Cat(false, "milk", 4, "black");
        Cat cat2 = new Cat(false, "milk", 4, "white");
        Cat cat3 = new Cat(false, "milk", 4, "brown");
        Cat cat4 = new Cat(false, "milk", 4, "grey");

        assertTrue(cat instanceof Animal);
        assertFalse(cat.isVegetarian());
        for (int i = 8; i > 1; i--) {
        	assertEquals(cat.soulLoss(), i);
		}
    	assertEquals(cat.soulLoss(), 1);
	}

}

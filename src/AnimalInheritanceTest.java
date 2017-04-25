import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalInheritanceTest {

	@Test
	public void test() {
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		assertEquals(a1, a2);
        Cat cat = new Cat(false, "milk", 4, "black");
        assertTrue(cat instanceof Animal);
        assertFalse(cat.isVegetarian());
        for (int i = 8; i > 1; i--) {
        	assertEquals(cat.soulLoss(), i);
		}
    	assertEquals(cat.soulLoss(), 1);
	}

}

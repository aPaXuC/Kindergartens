import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalInheritanceTest {

	@Test
	public void test() {
        Cat cat = new Cat(false, "milk", 4, "black");
        assertTrue(cat.isVegetarian());
	}

}

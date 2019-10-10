package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	@Test
	void test() {
		AddingMachine test = new AddingMachine();
		test.add(5);
		assertEquals(0 + 5, toString());
		
	}

}

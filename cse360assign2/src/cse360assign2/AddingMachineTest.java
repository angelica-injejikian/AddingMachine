/*
 * Author: Angelica Injejikian
 * Class ID: 85141
 * Assignment #: Assignment #2
 * Description: This contains all of the Junit tests.
 * Link to GitHub: https://github.com/angelica-injejikian/AddingMachine
 */

package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	@Test
	void test1() {
		AddingMachine test = new AddingMachine();
		test.add(5);
		String expected = "0 + 5";
		String result = test.toString();
		assertEquals(expected, result);
		
	}
	
	@Test
	void test2() {
		AddingMachine test = new AddingMachine();
		test.subtract(7);
		String expected = "0 - 7";
		String result = test.toString();
		assertEquals(expected, result);
		
	}
	
	@Test
	void test3() {
		AddingMachine test = new AddingMachine();
		test.subtract(7);
		test.add(83);
		test.clear();
		String expected = "0";
		String result = test.toString();
		assertEquals(expected, result);
		
	}
	
	@Test
	void test4() {
		AddingMachine test = new AddingMachine();
		test.subtract(3);
		test.add(83);
		test.add(93);
		test.subtract(1);
		String expected = "0 - 3 + 83 + 93 - 1";
		String result = test.toString();
		assertEquals(expected, result);
		
	}

}

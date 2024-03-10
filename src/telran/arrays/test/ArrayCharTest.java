package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import telran.arrays.ArrayChar;

class ArrayCharTest {

	@Test
	void compareToTest() {
		char[] ar1 = {'1', '2', '3'}; //"123"
		char[] ar2 = {'9'};
		char[] ar3 = {'1', '2', '3'};
		char[] ar4 = {};
		char[] ar5 = {};
		
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		ArrayChar arrayChar4 = new ArrayChar(ar4);
		ArrayChar arrayChar5 = new ArrayChar(ar5);
		
		assertEquals(8, arrayChar2.compareTo(arrayChar1));
		assertEquals(-8, arrayChar1.compareTo(arrayChar2));
		assertEquals(1, new ArrayChar(new char[] {'a', 'a'})
				.compareTo(new ArrayChar(new char[] {'a'})));
		assertEquals(-1, new ArrayChar(new char[] {'a'})
				.compareTo(new ArrayChar(new char[] {'a', 'a'})));
		assertEquals(0, arrayChar1.compareTo(arrayChar3));
		assertEquals(3, arrayChar1.compareTo(arrayChar4));
		assertEquals(0, arrayChar4.compareTo(arrayChar5));
	}
	
	@Test
	void indexOfTest() {
		char[] ar1 = {'1', '2', '3', '2'}; //"123"
		char[] ar2 = {};
		
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		
		assertEquals(1, arrayChar1.indexOf('2'));
		assertEquals(-1, arrayChar1.indexOf('7'));
		assertEquals(-1, arrayChar2.indexOf('0'));
	}
	
	@Test
	void lastIndexOfTest() {
		char[] ar1 = {'1', '2', '3', '2'}; //"123"
		char[] ar2 = {};
		
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		
		assertEquals(3, arrayChar1.lastIndexOf('2'));
		assertEquals(-1, arrayChar1.lastIndexOf('7'));
		assertEquals(-1, arrayChar2.lastIndexOf('1'));
	}
	
	//HOMEWORK #5
	
	@Test
	void countTest() {
		char[] ar1 = {'1', 'H' , 'e', 'l', 'L', 'o', 'O'};
		char[] ar2 = {};
		
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		
		assertEquals(1, arrayChar1.count('e'));
		assertEquals(0, arrayChar1.count('h'));
		assertEquals(1, arrayChar1.count('l'));
		assertEquals(0, new ArrayChar(new char[]{}).count('0'));
		assertEquals(0, arrayChar2.count('o'));
	}
	
	@Test
	void compareToIgnoreCaseTest() {
		char[] ar1 = {'H', 'e', 'l', 'L', 'o'};
		char[] ar2 ={'h', 'E', 'l', 'L', 'o'};
		char[] ar3 = {'h', 'e'};
		char[] ar4 = {'H', 'W'};
		char[] ar5 = {};
		
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		ArrayChar arrayChar4 = new ArrayChar(ar4);
		ArrayChar arrayChar5 = new ArrayChar(ar5);
		
		assertEquals(0, arrayChar2.compareToIgnoreCase(arrayChar1));
		assertEquals(-18, arrayChar1.compareToIgnoreCase(arrayChar4));
		assertEquals(1, new ArrayChar(new char[] {'a', 'a'})
				.compareToIgnoreCase(new ArrayChar(new char[] {'A'})));
		assertEquals(-1, new ArrayChar(new char[] {'a'})
				.compareToIgnoreCase(new ArrayChar(new char[] {'a', 'A'})));		
		assertEquals(3, arrayChar1.compareToIgnoreCase(arrayChar3));
		assertEquals(5, arrayChar1.compareToIgnoreCase(arrayChar5));
	}
	
	@Test
	void compareToIgnoreCase1Test() {
		char[] ar1 = {'H', 'e', 'l', 'L', 'o'};
		char[] ar2 ={'h', 'E', 'l', 'L', 'o'};
		char[] ar3 = {'h', 'e'};
		char[] ar4 = {'H', 'W'};
		char[] ar5 = {};
		
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		ArrayChar arrayChar4 = new ArrayChar(ar4);
		ArrayChar arrayChar5 = new ArrayChar(ar5);
		
		assertEquals(0, arrayChar2.compareToIgnoreCase1(arrayChar1));
		assertEquals(-18, arrayChar1.compareToIgnoreCase1(arrayChar4));
		assertEquals(1, new ArrayChar(new char[] {'a', 'a'})
				.compareToIgnoreCase1(new ArrayChar(new char[] {'A'})));
		assertEquals(-1, new ArrayChar(new char[] {'a'})
				.compareToIgnoreCase1(new ArrayChar(new char[] {'a', 'A'})));		
		assertEquals(3, arrayChar1.compareToIgnoreCase1(arrayChar3));
		assertEquals(5, arrayChar1.compareToIgnoreCase1(arrayChar5));
	}
	
	@Test
	void containsTest() {
		char[] ar1 = {'H', 'e', 'l', 'L', 'o'};
		char[] ar2 = {};
		
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		
		assertTrue(arrayChar1.contains('e'));
		assertFalse(arrayChar1.contains('W'));
		assertFalse(arrayChar2.contains('o'));
	}
	
	@Test
	void contains1Test() {
		char[] ar1 = {'H', 'e', 'l', 'L', 'o'};
		char[] ar2 = {};
		
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		
		assertTrue(arrayChar1.contains1('e'));
		assertFalse(arrayChar1.contains1('W'));
		assertFalse(arrayChar2.contains1('o'));
	}
	
	@Test
	void equalsTest() {
		char[] ar1 = {'1', '2', '3'}; //"123"
		char[] ar2 = {'9'};
		char[] ar3 = {'1', '2', '3'};
		char[] ar4 = {};
		char[] ar5 = {};
		
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		ArrayChar arrayChar4 = new ArrayChar(ar4);
		ArrayChar arrayChar5 = new ArrayChar(ar5);
		
		//Calling method 'equals' which calls method 'compareTo'
		assertFalse(arrayChar2.equals(arrayChar1));
		assertFalse(arrayChar1.equals(arrayChar2));
		assertFalse(new ArrayChar(new char[] {'a', 'a'})
				.equals(new ArrayChar(new char[] {'a'})));
		assertFalse(new ArrayChar(new char[] {'a'})
				.equals(new ArrayChar(new char[] {'a', 'a'})));
		assertTrue(arrayChar1.equals(arrayChar3));
		assertFalse(arrayChar2.equals(arrayChar4));
		assertTrue(arrayChar4.equals(arrayChar5));
		
		//Calling method 'compareTo' directly
		assertFalse(arrayChar2.compareTo(arrayChar1) == 0);
		assertFalse(arrayChar1.compareTo(arrayChar2) == 0);
		assertFalse(new ArrayChar(new char[] {'a', 'a'})
				.compareTo(new ArrayChar(new char[] {'a'})) == 0);
		assertFalse(new ArrayChar(new char[] {'a'})
				.compareTo(new ArrayChar(new char[] {'a', 'a'})) == 0);
		assertTrue(arrayChar1.compareTo(arrayChar3) == 0);
		assertFalse(arrayChar2.compareTo(arrayChar4) == 0);
		assertTrue(arrayChar4.compareTo(arrayChar5) == 0);
	}
	
	@Test
	void equalsIgnoreCaseTest() {
		char[] ar1 = {'H', 'e', 'l', 'L', 'o'};
		char[] ar2 ={'h', 'E', 'l', 'L', 'o'};
		char[] ar3 = {'h', 'e'};
		char[] ar4 = {'H', 'W'};
		char[] ar5 = {};
		
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		ArrayChar arrayChar4 = new ArrayChar(ar4);
		ArrayChar arrayChar5 = new ArrayChar(ar5);
		
		//Calling method 'equalsIgnoreCase' which calls method 'compareToIgnoreCase'
		assertTrue(arrayChar2.equalsIgnoreCase(arrayChar1));
		assertFalse(arrayChar1.equalsIgnoreCase(arrayChar4));
		assertFalse(new ArrayChar(new char[] {'a', 'a'})
				.equalsIgnoreCase(new ArrayChar(new char[] {'A'})));
		assertFalse(new ArrayChar(new char[] {'a'})
				.equalsIgnoreCase(new ArrayChar(new char[] {'a', 'A'})));
		assertFalse(arrayChar1.equalsIgnoreCase(arrayChar3));
		assertFalse(arrayChar3.equalsIgnoreCase(arrayChar5));
		
		//Calling method 'compareToIgnoreCase' directly
		assertTrue(arrayChar2.compareToIgnoreCase(arrayChar1) == 0);
		assertFalse(arrayChar1.compareToIgnoreCase(arrayChar4) == 0);
		assertFalse(new ArrayChar(new char[] {'a', 'a'})
				.compareToIgnoreCase(new ArrayChar(new char[] {'A'})) == 0);
		assertFalse(new ArrayChar(new char[] {'a'})
				.compareToIgnoreCase(new ArrayChar(new char[] {'a', 'A'})) == 0);
		assertFalse(arrayChar1.compareToIgnoreCase(arrayChar3) == 0);
		assertTrue(arrayChar1.compareToIgnoreCase(arrayChar5) !=0);
	}

}

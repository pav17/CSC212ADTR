package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {
	
	//size
	//insert
	//contains
	//remove
	
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		assertEquals(0, empty.size());
	}
	
	@Test
	public void testSize1() {
		SetADT<String> single = new JavaSet<>();
		single.insert("Z");
		
		assertEquals(1, single.size());
	}
	
	@Test
	public void testSizeFull() {
		SetADT<String> multiple = new JavaSet<>();
		multiple.insert("0");
		multiple.insert("5");
		multiple.insert("9");
		multiple.insert("12");
		multiple.insert("777");
		multiple.insert("34");
		
		assertEquals(6, multiple.size());
	}
	
	@Test
	public void testRepeatedInsert() {
		SetADT<String> items = new JavaSet<>();
		items.insert("A");
		items.insert("B");
		items.insert("C");
		for (int i = 0; i<100; i++) {
			items.insert("C");
			assertEquals(3, items.size());
		}
		assertEquals(true, items.contains("A"));
		assertEquals(true, items.contains("B"));
		assertEquals(true, items.contains("C"));
	}
	
	@Test
	public void testContainsString() {
		SetADT<String> items = new JavaSet<>();
		items.insert("TestString");
		assertEquals(true, items.contains("TestString"));
	}
	
	@Test
	public void testContainsInt() {
		SetADT<Integer> items = new JavaSet<>();
		items.insert(5);
		assertEquals(true, items.contains(5));
	}
	
	@Test
	public void testContainsFloat() {
		SetADT<Float> items = new JavaSet<>();
		items.insert(5.0f);
		assertEquals(true, items.contains(5.0f));
	}
	
	@Test
	public void testDoesntContain() {
		SetADT<String> items = new JavaSet<>();
		items.insert("TestString");
		assertEquals(false, items.contains("TestStringTwoElectricBoogaloo"));
	}
	
	@Test
	public void testRemoveByValue() {
		SetADT<Integer> items = new JavaSet<>();
		items.insert(1);
		items.insert(2);
		items.insert(4);
		items.insert(8);
		items.insert(16);
		items.insert(32);
		items.insert(64);
		
		items.remove(8);
		
		assertEquals(6, items.size());
		assertEquals(false, items.contains(8));
	}
}















































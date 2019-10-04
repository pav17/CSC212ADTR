package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {
	
	// you might want this.
	void assertIntEq(int x, int y) {
		assertEquals(x, y);
	}

	@Test
	public void testEmpty() {
		MapADT<String, String> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
		//Assert.assert
	}
	
	@Test
	public void testMapPut() {
		MapADT<String, String> stringMap = new JavaMap<>();
		assertEquals(0, stringMap.size());
		stringMap.put("banana", "fruit");
		assertEquals(1, stringMap.size());
		stringMap.put("potato", "tuber");
		assertEquals(2, stringMap.size());
	}
	
	@Test
	public void testMapPutOveride() {
		MapADT<String, String> stringMap = new JavaMap<>();
		stringMap.put("mango", "fruit");
		assertEquals("fruit", stringMap.get("mango"));
		stringMap.put("mango", "tropical fruit");
		assertEquals("tropical fruit", stringMap.get("mango"));
	}
	
	@Test
	public void testMapGet() {
		MapADT<String, String> stringMap = new JavaMap<>();
		stringMap.put("mango", "fruit");
		stringMap.put("potato", "tuber");
		
		assertEquals("fruit", stringMap.get("mango"));
		assertEquals("tuber", stringMap.get("potato"));
	}
	
	@Test
	public void testMapGetFalse() {
		MapADT<String, String> stringMap = new JavaMap<>();
		stringMap.put("mango", "fruit");
		stringMap.put("potato", "tuber");
		
		assertEquals(null, stringMap.get("strawberry"));
		assertEquals(null, stringMap.get("squash"));
	}
	
	@Test
	public void testMapSize() {
		MapADT<String, String> stringMap = new JavaMap<>();
		stringMap.put("banana", "fruit");
		stringMap.put("strawberry", "fruit");
		stringMap.put("mango", "fruit");
		stringMap.put("potato", "tuber");
		
		assertEquals(4, stringMap.size());
	}
	
	@Test
	public void testMapRemove() {
		MapADT<String, String> stringMap = new JavaMap<>();
		stringMap.put("banana", "fruit");
		stringMap.put("strawberry", "fruit");
		stringMap.put("mango", "fruit");
		stringMap.put("potato", "tuber");
		
		assertEquals(4, stringMap.size());
		assertEquals("fruit", stringMap.remove("mango"));
		assertEquals(3, stringMap.size());
	}
	
	@Test
	public void testMapRemoveFalse() {
		MapADT<String, String> stringMap = new JavaMap<>();
		stringMap.put("banana", "fruit");
		stringMap.put("strawberry", "fruit");
		stringMap.put("mango", "fruit");
		stringMap.put("potato", "tuber");
		
		assertEquals(null, stringMap.remove("pineapple"));
	}
}



































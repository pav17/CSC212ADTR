package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;

import org.junit.Test;


import edu.smith.cs.csc212.adtr.real.JavaList;

import edu.smith.cs.csc212.adtr.real.JavaMap;
import edu.smith.cs.csc212.adtr.real.JavaSet;

public class ChallengesTest {

	@Test
	public void testUnionEmpty() {
		SetADT<Integer> left = new JavaSet<Integer>();
		SetADT<Integer> right = new JavaSet<Integer>();
		
		SetADT<Integer> combo = Challenges.union(left, right);
		assertEquals(0, combo.size());
	}
	
	@Test
	public void testUnionFull() {
		SetADT<Integer> left = new JavaSet<Integer>();
		left.insert(1);
		left.insert(2);
		left.insert(3);
		left.insert(4);
		SetADT<Integer> right = new JavaSet<Integer>();
		right.insert(4);
		right.insert(5);
		right.insert(6);
		right.insert(7);
		
		SetADT<Integer> combo = Challenges.union(left, right);
		assertEquals(7, combo.size());
	}
	
	@Test
	public void testIntersectionEmpty() {
		SetADT<Integer> left = new JavaSet<Integer>();
		SetADT<Integer> right = new JavaSet<Integer>();
		
		SetADT<Integer> combo = Challenges.union(left, right);
		assertEquals(0, combo.size());
	}
	
	@Test
	public void testIntersectionFull() {
		SetADT<Integer> left = new JavaSet<Integer>();
		left.insert(1);
		left.insert(2);
		left.insert(3);
		left.insert(4);
		SetADT<Integer> right = new JavaSet<Integer>();
		right.insert(3);
		right.insert(4);
		right.insert(5);
		right.insert(6);
		
		SetADT<Integer> combo = Challenges.intersection(left, right);
		assertEquals(2, combo.size());
		assertEquals(true, combo.contains(3));
		assertEquals(true, combo.contains(4));
		assertEquals(false, combo.contains(1));
	}
	
	@Test
	public void testWordCountFull() {
		ListADT<String> words = new JavaList<String>();
		words.addBack("Hello");
		words.addBack("my");
		words.addBack("name");
		words.addBack("is");
		words.addBack("test");
		
		MapADT<String, Integer> output = new JavaMap<>();
		output = Challenges.wordCount(words);
		assertEquals(5, output.size());
		assertEquals(3, (int) output.get("name"));
	}
	
	@Test
	public void testWordCountEmpty() {
		ListADT<String> words = new JavaList<String>();
		
		MapADT<String, Integer> output = new JavaMap<>();
		output = Challenges.wordCount(words);
		assertEquals(0, output.size());
	}

}

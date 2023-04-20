package test;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class CategoryTest {

	@Test
	public void testAddMultiple() {
	    LinkedList<Integer> list = new LinkedList<>();
	    list.add(1);
	    list.add(2);
	    list.add(3);
	    assertEquals(Integer.valueOf(1), list.getFirst());
	    assertEquals(Integer.valueOf(2), list.get(1));
	    assertEquals(Integer.valueOf(3), list.getLast());
	}

	@Test
	public void testRemoveMultiple() {
	    LinkedList<Integer> list = new LinkedList<>();
	    list.add(1);
	    list.add(2);
	    list.add(3);
	    Integer removedValue = list.remove(1);
	    assertEquals(Integer.valueOf(2), removedValue);
	    assertEquals(Integer.valueOf(1), list.getFirst());
	    assertEquals(Integer.valueOf(3), list.getLast());
	}

	@Test
	public void testSize() {
	    LinkedList<Integer> list = new LinkedList<>();
	    list.add(1);
	    list.add(2);
	    list.add(3);
	    assertEquals(3, list.size());
	}

	@Test
	public void testContains() {
	    LinkedList<Integer> list = new LinkedList<>();
	    list.add(1);
	    list.add(2);
	    list.add(3);
	    assertTrue(list.contains(2));
	    assertFalse(list.contains(4));
	}

}

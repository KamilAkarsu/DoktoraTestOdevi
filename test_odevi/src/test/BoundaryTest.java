package test;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class BoundaryTest {

	@Test
	public void testAddFirstBoundary() {
	    LinkedList<Integer> list = new LinkedList<>();
	    list.addFirst(1);
	    assertEquals(Integer.valueOf(1), list.getFirst());
	}

	@Test
	public void testAddLastBoundary() {
	    LinkedList<Integer> list = new LinkedList<>();
	    list.addLast(1);
	    assertEquals(Integer.valueOf(1), list.getLast());
	}

	@Test
	public void testRemoveFirstBoundary() {
	    LinkedList<Integer> list = new LinkedList<>();
	    list.addFirst(1);
	    Integer removedValue = list.removeFirst();
	    assertEquals(Integer.valueOf(1), removedValue);
	}

	@Test
	public void testRemoveLastBoundary() {
	    LinkedList<Integer> list = new LinkedList<>();
	    list.addLast(1);
	    Integer removedValue = list.removeLast();
	    assertEquals(Integer.valueOf(1), removedValue);
	}

	@Test
	public void testGetFirstBoundary() {
	    LinkedList<Integer> list = new LinkedList<>();
	    list.addFirst(1);
	    Integer firstValue = list.getFirst();
	    assertEquals(Integer.valueOf(1), firstValue);
	}

	@Test
	public void testGetLastBoundary() {
	    LinkedList<Integer> list = new LinkedList<>();
	    list.addLast(1);
	    Integer lastValue = list.getLast();
	    assertEquals(Integer.valueOf(1), lastValue);
	}

}

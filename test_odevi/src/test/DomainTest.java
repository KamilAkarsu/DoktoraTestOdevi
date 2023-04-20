package test;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;
public class DomainTest {

	@Test
    public void testAddAndGetWithStrings() {
        LinkedList<String> list = new LinkedList<>();
        list.add("foo");
        list.add("bar");
        list.add("baz");
        assertEquals("foo", list.get(0));
        assertEquals("bar", list.get(1));
        assertEquals("baz", list.get(2));
    }

    @Test
    public void testAddAndGetWithIntegers() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(2), list.get(1));
        assertEquals(Integer.valueOf(3), list.get(2));
    }

    @Test
    public void testRemoveWithStrings() {
        LinkedList<String> list = new LinkedList<>();
        list.add("foo");
        list.add("bar");
        list.add("baz");
        list.remove(1);
        assertEquals("foo", list.get(0));
        assertEquals("baz", list.get(1));
        assertEquals(2, list.size());
    }

    @Test
    public void testRemoveWithIntegers() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(3), list.get(1));
        assertEquals(2, list.size());
    }


    @Test
    public void testInsertWithIntegers() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(2), list.get(1));
        assertEquals(Integer.valueOf(3), list.get(2));
        assertEquals(Integer.valueOf(4), list.get(3));
    }

    @Test
    public void testSizeWithStrings() {
        LinkedList<String> list = new LinkedList<>();
        assertEquals(0, list.size());
        list.add("foo");
        assertEquals(1, list.size());
        list.add("bar");
        assertEquals(2, list.size());
    }

    @Test
    public void testSizeWithIntegers() {
        LinkedList<Integer> list = new LinkedList<>();
        assertEquals(0, list.size());
        list.add(1);
        assertEquals(1, list.size());
        list.add(2);
        assertEquals(2, list.size());
    }

    @Test
    public void testIsEmptyWithStrings() {
        LinkedList<String> list = new LinkedList<>();
        assertTrue(list.isEmpty());
        list.add("foo");
        assertFalse(list.isEmpty());
    }

    @Test
    public void testIsEmptyWithIntegers() {
        LinkedList<Integer> list = new LinkedList<>();
        assertTrue(list.isEmpty());
        list.add(1);
        assertFalse(list.isEmpty());
    }

}

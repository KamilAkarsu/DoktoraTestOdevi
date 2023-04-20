package test;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;
public class StructuralTest {

	@Test
    public void testAddAndGet() {
        LinkedList<String> list = new LinkedList<>();
        list.add("foo");
        list.add("bar");
        list.add("baz");
        assertEquals("foo", list.get(0));
        assertEquals("bar", list.get(1));
        assertEquals("baz", list.get(2));
    }

    @Test
    public void testRemove() {
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
    public void testSize() {
        LinkedList<String> list = new LinkedList<>();
        assertEquals(0, list.size());
        list.add("foo");
        assertEquals(1, list.size());
        list.add("bar");
        assertEquals(2, list.size());
    }

    @Test
    public void testIsEmpty() {
        LinkedList<String> list = new LinkedList<>();
        assertTrue(list.isEmpty());
        list.add("foo");
        assertFalse(list.isEmpty());
    }
    /*
     * Bu testler, bağlı listenin yapısal doğruluğunu kontrol etmek
     * için özellikle eklemeler, çıkarmalar ve ekleme işlemlerinde yapılır.
     * Yapısal testler ayrıca bağlı listenin boş olup olmadığını ve boyutunu da kontrol eder.*/
}

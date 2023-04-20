package test;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;
public class DesignByContractTest {

	@Test
    public void testSizeAfterAddition() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
            assertEquals(i + 1, list.size());
        }
    }

    @Test
    public void testIsEmptyAfterAdditionAndRemoval() {
        LinkedList<String> list = new LinkedList<String>();
        for (int i = 0; i < 10; i++) {
            list.add("element " + i);
            assertFalse(list.isEmpty());
        }
        for (int i = 0; i < 10; i++) {
            list.remove();
        }
        assertTrue(list.isEmpty());
    }

    @Test
    public void testFirstElementAfterAddingToEmptyList() {
        LinkedList<String> list = new LinkedList<String>();
        String element = "first element";
        list.addFirst(element);
        assertEquals(element, list.getFirst());
    }

    @Test
    public void testLastElementAfterAddingToEmptyList() {
        LinkedList<String> list = new LinkedList<String>();
        String element = "last element";
        list.addLast(element);
        assertEquals(element, list.getLast());
    }

    @Test
    public void testIndexOfAfterAddingAndRemoving() {
        LinkedList<String> list = new LinkedList<String>();
        list.add("first element");
        list.add("second element");
        list.add("third element");
        assertEquals(1, list.indexOf("second element"));
        list.remove(1);
        assertEquals(-1, list.indexOf("second element"));
    }
    /*Bu örnek, LinkedList sınıfının bazı özelliklerini test eder.
     *İlk test, öğelerin listeye eklenmesi durumunda listenin boyutunu doğrular.
     *İkinci test, öğelerin eklenmesi ve çıkarılması durumunda listenin boş olup olmadığını doğrular.
     *Üçüncü ve dördüncü testler, listenin ilk ve son öğelerinin eklenmesi durumunda doğruluğunu doğrular.
     *Son olarak, beşinci test, belirli bir öğenin listeye eklenmesi ve
     *kaldırılması durumunda listenin indeksini doğrular.*/

}

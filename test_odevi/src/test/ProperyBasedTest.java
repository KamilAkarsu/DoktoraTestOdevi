package test;

import static org.junit.Assert.*;
import java.util.LinkedList;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
public class ProperyBasedTest {
	
	// Test adding an element and checking that the size increases by 1
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 10, 100})
    public void testAddIncreasesSize(int numElements) {
        LinkedList<Integer> list = new LinkedList<>();
        int initialSize = list.size();
        for (int i = 0; i < numElements; i++) {
            list.add(i);
        }
        int finalSize = list.size();
        assertEquals(initialSize + numElements, finalSize);
    }
    
    // Test removing an element from the list
    @Test
    public void testRemoveElement() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertTrue(list.contains(2));
        list.remove((Integer) 2);
        assertFalse(list.contains(2));
    }
    
    // Test getting an element from the list by index
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 10, 100})
    public void testGetElement(int index) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < index + 1; i++) {
            list.add(i);
        }
        assertEquals((Integer) index, list.get(index));
    }
	
    /*Bu kod, iki özellik test eder:
	Bir elemanın eklenmesi, listenin boyutunun 1 artması gerektiği
	Bir elemanın listeden kaldırılması, listede olmaması gerektiği
	İki test de parametreli testlerdir, çünkü her testi 
	farklı sayıda eleman içeren farklı listelerle çalıştırmak istiyoruz.
	
	Üçüncü testimiz, listedeki belirli bir indeksin elemanını alma
	özelliğini test eder ve yine parametreli bir testtir.*/
	
}

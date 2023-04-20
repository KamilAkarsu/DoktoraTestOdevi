package test;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;
public class ModelTest {

	@Test
    public void testAddAndRemove() {
        // Create a new linked list
        LinkedList<Integer> list = new LinkedList<>();

        // Add some elements to the list
        list.add(1);
        list.add(2);
        list.add(3);

        // Check that the list size is 3
        assertEquals(3, list.size());

        // Remove the second element (value 2)
        list.remove(1);

        // Check that the list size is now 2
        assertEquals(2, list.size());

        // Check that the first element is still 1
        assertEquals(1, (int) list.get(0));

        // Check that the second element is now 3
        assertEquals(3, (int) list.get(1));
    }
	
	/*Bu test senaryosu, yeni bir bağlı liste oluşturur ve daha sonra 1, 2 ve 3
	 *değerlerini içeren üç eleman ekler. Sonra ikinci elemanı (değer 2)
	 *siler ve listenin boyutunun 2 olduğunu ve geri kalan elemanların 1 ve 3
	 *olduğunu kontrol eder. Bu senaryo, bir bağlı listenin ekleme ve silme
	 *işlevselliğini doğru şekilde gerçekleştirdiğinden emin olmak için kullanılabilir.
	 * 
	 * */

}

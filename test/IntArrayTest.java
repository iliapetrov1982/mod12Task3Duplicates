import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntArrayTest {
    IntArray intArray;

    @Before
    public void setUp() {
        intArray = new IntArray();
    }

    @Test
    public void isContaintsDuplicatesTrue() {
        int[] array = {4, 5, 6, 6, 8};
        assertTrue(intArray.isContaintsDuplicates(array));
    }

    @Test
    public void isContaintsDuplicatesFalse() {
        int[] array = {4, 5, 6, 7, 8};
        assertFalse(intArray.isContaintsDuplicates(array));
    }
}
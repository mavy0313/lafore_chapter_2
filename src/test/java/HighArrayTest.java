import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class HighArrayTest {

    @Test
    public void shouldDeleteElement() {
        HighArray highArray = new HighArray(3);
        highArray.insert(3);
        highArray.insert(5);
        highArray.insert(1);

        highArray.delete(1);

        assertFalse(highArray.find(1));
    }

    @Test
    public void getMaxShouldReturnMaxElement() {
        HighArray highArray = new HighArray(3);
        highArray.insert(3);
        highArray.insert(5);
        highArray.insert(1);

        assertEquals(5, highArray.getMax());
    }

    @Test
    public void getMaxShouldReturnMinusOneIfArrayIsEmpty() {
        HighArray highArray = new HighArray(2);

        assertEquals(-1, highArray.getMax());
    }

    @Test
    public void removeMaxShouldRemoveAndReturnMaxElement() {
        HighArray highArray = new HighArray(3);
        highArray.insert(3);
        highArray.insert(5);
        highArray.insert(1);

        assertEquals(5, highArray.removeMax());
    }

    @Test
    public void removeMaxShouldRemoveMaxElementAndChangeArray() {
        HighArray highArray = new HighArray(3);
        highArray.insert(3);
        highArray.insert(5);
        highArray.insert(1);

        long[] expectedArray = new long[]{3, 1};

        highArray.removeMax();

        assertArrayEquals(expectedArray, highArray.getArray());
    }

    @Test
    public void shouldRemoveDuplicatesEmptyArray() {
        HighArray highArray = new HighArray(0);

        long[] expectedArray = new long[0];

        highArray.noDups();

        assertArrayEquals(expectedArray, highArray.getArray());
    }

    @Test
    public void shouldRemoveDuplicates() {
        HighArray highArray = new HighArray(6);
        highArray.insert(1);
        highArray.insert(2);
        highArray.insert(7);
        highArray.insert(1);
        highArray.insert(1);
        highArray.insert(7);

        long[] expectedArray = new long[]{1, 2, 7};

        highArray.noDups();

        assertArrayEquals(expectedArray, highArray.getArray());
    }
}

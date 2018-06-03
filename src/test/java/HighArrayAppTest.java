import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class HighArrayAppTest {

    @Test
    public void selectedSortOneElementInArray() {
        HighArray highArray = new HighArray(1);
        highArray.insert(5);

        HighArrayApp highArrayApp = new HighArrayApp();

        long[] expectedArray = new long[]{5};
        long[] actualArray = highArrayApp.selectionSort(highArray.getArray());

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void selectedSortManyElementsInArray() {
        HighArray highArray = new HighArray(5);
        highArray.insert(5);
        highArray.insert(9);
        highArray.insert(1);
        highArray.insert(0);
        highArray.insert(3);

        HighArrayApp highArrayApp = new HighArrayApp();

        long[] expectedArray = new long[]{0, 1, 3, 5, 9};
        long[] actualArray = highArrayApp.selectionSort(highArray.getArray());

        assertArrayEquals(expectedArray, actualArray);
    }
}

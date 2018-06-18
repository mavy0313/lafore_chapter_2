import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class OrdArrayTest {

    @Test
    public void shouldMergeTwoSortedArraysIntoOne() {
        long[] firstArray = new long[] {1, 2};
        long[] secondArray = new long[] {3, 4};

        OrdArray ordArray = new OrdArray(4);

        assertArrayEquals(new long[] {1, 2, 3, 4}, ordArray.merge(firstArray, secondArray));
    }

    @Test
    public void shouldMergeTwoUnsortedArraysIntoOneSorted() {
        long[] firstArray = new long[] {4, 1};
        long[] secondArray = new long[] {3, 2};

        OrdArray ordArray = new OrdArray(4);

        assertArrayEquals(new long[] {1, 2, 3, 4}, ordArray.merge(firstArray, secondArray));
    }
}

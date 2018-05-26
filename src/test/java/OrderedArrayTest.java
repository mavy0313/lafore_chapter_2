import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderedArrayTest {

    @Test
    public void shouldInsertOneValue() {
        OrderedArray orderedArray = new OrderedArray(1);
        orderedArray.insert(2);
        assertEquals("[2]", orderedArray.getValues());
    }

    @Test
    public void shouldInsertTwoOrderedValues() {
        OrderedArray orderedArray = new OrderedArray(2);
        orderedArray.insert(1);
        orderedArray.insert(2);
        assertEquals("[1, 2]", orderedArray.getValues());
    }

    @Test
    public void shouldInsertTwoValuesAndSort() {
        OrderedArray orderedArray = new OrderedArray(2);
        orderedArray.insert(2);
        orderedArray.insert(1);
        assertEquals("[1, 2]", orderedArray.getValues());
    }

    @Test
    public void shouldInsertFourValuesAndSort() {
        OrderedArray orderedArray = new OrderedArray(4);
        orderedArray.insert(7);
        orderedArray.insert(3);
        orderedArray.insert(2);
        orderedArray.insert(5);
        assertEquals("[2, 3, 5, 7]", orderedArray.getValues());
    }

    @Test
    public void shouldInsertFiveValuesAndSort() {
        OrderedArray orderedArray = new OrderedArray(5);
        orderedArray.insert(7);
        orderedArray.insert(1);
        orderedArray.insert(0);
        orderedArray.insert(5);
        orderedArray.insert(2);
        assertEquals("[0, 1, 2, 5, 7]", orderedArray.getValues());
    }

    @Test
    public void shouldNotFindElement() {
        OrderedArray orderedArray = new OrderedArray(2);
        orderedArray.insert(1);
        orderedArray.insert(2);
        assertEquals(orderedArray.size(), orderedArray.find(7));
    }

    @Test
    public void shouldFindElementInTwoSizeArray() {
        OrderedArray orderedArray = new OrderedArray(3);
        orderedArray.insert(1);
        orderedArray.insert(2);
        orderedArray.insert(3);
        assertEquals(3, orderedArray.find(3));
    }
}

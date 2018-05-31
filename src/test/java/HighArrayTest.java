import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighArrayTest {

    @Test
    public void shouldReturnElementWithMaxKeyInArray() {
        HighArray highArray = new HighArray(3);
        highArray.insert(1);
        highArray.insert(2);
        highArray.insert(3);
        assertEquals(3, highArray.getMax());
    }

    @Test
    public void shouldReturnMinusOneIfArrayIsEmpty() {
        HighArray highArray = new HighArray(2);
        assertEquals(-1, highArray.getMax());
    }

    @Test
    public void shouldRemoveElementWithMaxKeyInArray() {
        HighArray highArray = new HighArray(3);
        highArray.insert(1);
        highArray.insert(2);
        highArray.insert(3);
        highArray.removeMax();

        assertEquals(2, highArray.getMax());
    }
}

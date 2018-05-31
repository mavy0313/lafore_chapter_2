import org.junit.Test;

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
    public void shouldReturnMaxElement() {
        HighArray highArray = new HighArray(3);
        highArray.insert(3);
        highArray.insert(5);
        highArray.insert(1);

        assertEquals(5, highArray.getMax());
    }

    @Test
    public void shouldReturnMinusOneIfArrayIsEmpty() {
        HighArray highArray = new HighArray(2);

        assertEquals(-1, highArray.getMax());
    }

    @Test
    public void shouldRemoveMaxElement() {
        HighArray highArray = new HighArray(3);
        highArray.insert(3);
        highArray.insert(5);
        highArray.insert(1);

        highArray.removeMax();

        assertEquals(3, highArray.getMax());
    }


}

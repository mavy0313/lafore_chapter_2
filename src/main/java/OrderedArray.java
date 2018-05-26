import java.util.Arrays;

public class OrderedArray {

    private final int size;
    private final int[] array;
    private int currentPosition = 0;

    public OrderedArray(int size) {
        this.size = size;
        this.array = new int[size];
    }

    public String getValues() {
        return Arrays.toString(array);
    }

    public void insert(int element) {
        int i;
        for (i = 0; i < size; i++) {
            if (element < array[i]) {
                for (int j = size - 1; j > i; j--) {
                    array[j] = array[j - 1];
                }
                array[i] = element;
                return;
            }
        }

        array[currentPosition] = element;
        currentPosition++;
    }

    public int find(int element) {
        //Simple search
//        for (int i = 0; i < size; i++) {
//            if (array[i] == element) {
//                return array[i];
//            }
//        }
//        return size;

        //binary search
        int lower = 0;
        int higher = size - 1;
        int currentIndex;

        while (true) {
            currentIndex = (lower + higher) / 2;
            if (lower > higher) {
                return size;
            } else if (array[currentIndex] == element) {
                return element;
            } else {
                if (element < array[currentIndex]) {
                    higher = currentIndex - 1;
                } else {
                    lower = currentIndex + 1;
                }
            }
        }
    }

    public int size() {
        return size;
    }
}

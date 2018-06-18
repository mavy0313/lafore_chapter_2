import java.util.Arrays;

public class OrdArray {

    private long[] a; // Ссылка на массив a
    private int nElems; // Количество элементов данных

    //-----------------------------------------------------------
    public OrdArray(int max) // Конструктор
    {
        a = new long[max]; // Создание массива
        nElems = 0;
    }
    //-----------------------------------------------------------

    public int size()
    { return nElems; }
    //-----------------------------------------------------------
    public int find(long searchKey)
    {
        int lowerBound = 0;
        int upperBound = nElems-1;
        int curIn;
        while(true)
        {
            curIn = (lowerBound + upperBound ) / 2;
            if(a[curIn]==searchKey)
                return curIn; // Элемент найден
            else if(lowerBound > upperBound)
                return nElems; // Элемент не найден
            else // Деление диапазона
            {
                if(a[curIn] < searchKey)
                    lowerBound = curIn + 1; // В верхней половине
                else
                    upperBound = curIn - 1; // В нижней половине
            }
        }
    }
    //-----------------------------------------------------------
    public void insert(long value) { // Вставка элемента в массив
//        int j;
//        for (j = 0; j < nElems; j++) {  // Определение позиции вставки
//            if (a[j] > value) {// (линейный поиск)
//                break;
//            }
//        }
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int j = 0;

        while (true) {
            if (lowerBound > upperBound) {
                break;
            }

            j = (lowerBound + upperBound) / 2;

            if (value > a[j]) {
                lowerBound = j + 1;
                j++;
            } else {
                upperBound = j - 1;
            }
        }

        for (int k = nElems; k > j; k--) { // Перемещение последующих элементов
            a[k] = a[k - 1];
        }
        a[j] = value; // Вставка
        nElems++; // Увеличение размера
    }
    //-----------------------------------------------------------
    public boolean delete(long value) {
        int j = find(value);
        if (j == nElems) { // Найти не удалось
            return false;
        } else { // Элемент найден
            for (int k = j; k < nElems; k++) { // Перемещение последующих элементов
                a[k] = a[k + 1];
            }
            nElems--; // Уменьшение размера
            return true;
        }
    }
    //-----------------------------------------------------------
    public void display() { // Вывод содержимого массива
        for (int j = 0; j < nElems; j++) { // Перебор всех элементов
            System.out.print(a[j] + " "); // Вывод текущего элемента
        }
        System.out.println();
    }

    public long[] merge(long[] firstArray, long[] secondArray) {
        int mergedLength = firstArray.length + secondArray.length;
        long[] merged = new long[mergedLength];

        //copy arrays into one

        for (int i = 0; i < firstArray.length; i++) {
            merged[i] = firstArray[i];
        }

        for (int i = 0; i < secondArray.length; i++) {
            merged[firstArray.length + i] = secondArray[i];
        }

//        System.arraycopy(firstArray, 0, merged, 0, firstArray.length);
//        System.arraycopy(secondArray, 0, merged, firstArray.length, secondArray.length);

        //bubble sorting of merged array

        for (int i = 0; i < mergedLength; i++) {
            for (int j = i + 1; j < mergedLength; j++) {
                if (merged[i] > merged[j]) {
                    long temp = merged[i];
                    merged[i] = merged[j];
                    merged[j] = temp;
                }
            }
        }

        return merged;
    }
    //-----------------------------------------------------------
}

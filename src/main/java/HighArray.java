import java.util.Arrays;

import static java.util.Arrays.*;

public class HighArray
{
    private long[] a; // Ссылка на массив a
    private int nElems; // Количество элементов в массиве
    //-----------------------------------------------------------
    public HighArray(int max) // Конструктор
    {
        a = new long[max]; // Создание массива
        nElems = 0; // Пока нет ни одного элемента
    }
    //-----------------------------------------------------------
    public boolean find(long searchKey)
    { // Поиск заданного значения
        int j;
        for (j = 0; j < nElems; j++) // Для каждого элемента
            if (a[j] == searchKey) // Значение найдено?
                break; // Да - выход из цикла
        if (j == nElems) // Достигнут последний элемент?
            return false; // Да
        else
            return true; // Нет
    }
    //-----------------------------------------------------------
    public void insert(long value) // Вставка элемента в массив
    {
        a[nElems] = value; // Собственно вставка
        nElems++; // Увеличение размера
    }
    //-----------------------------------------------------------
    public long delete(long value)
    {
        int j;
        for (j = 0; j < nElems; j++) { // Поиск заданного значения
            if (value == a[j]) {
                break;
            }
        }
        if (j == nElems) { // Найти не удалось
            return 0;
        } else { // Значение найдено
            for (int k = j; k < nElems - 1; k++) { // Сдвиг последующих элементов
                a[k] = a[k + 1];
            }
            nElems--; // Уменьшение размера

            long[] newArray = new long[nElems];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = a[i];
            }
            a = newArray;

            return value;
        }
    }
    //-----------------------------------------------------------
    public void display() // Вывод содержимого массива
    {
        for (int j = 0; j < nElems; j++) // Для каждого элемента
            System.out.print(a[j] + " "); // Вывод
        System.out.println("");
    }

    public long getMax() {
        long max = -1;

        if (nElems == 0) {
            return max;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        return max;
    }

    public long removeMax() {
//        int maxElementIndex = nElems - 1;
//        long[] newArray = new long[nElems - 1];
//        for (int i = 0; i < a.length - 1; i++) {
//            newArray[i] = a[i];
//        }
//        a = newArray;
//        nElems--;

//        long max = getMax();
//        for (int i = 0; i < a.length; i++) {
//
//        }

        return delete(getMax());
    }

    public long[] getArray() {
        return a;
    }

    public void noDups() {
        long[] copy = copyOf(a, a.length);

        for (int i = 0; i < copy.length; i++) {
            for (int j = i + 1; j < copy.length; j++) {
                if (copy[i] == copy[j]) {
                    copy[j] = -1;
                }
            }
        }

        int countMinusOne = 0;
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] == -1) {
                countMinusOne++;
            }
        }

        int resultLength = copy.length - countMinusOne;
        long[] result = new long[resultLength];
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] != -1) {
                result[i] = copy[i];
            }
        }
        nElems = resultLength;
        a = result;
    }
//-----------------------------------------------------------
} // Конец класса HighArray

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
    for(j=0; j<nElems; j++) // Для каждого элемента
        if(a[j] == searchKey) // Значение найдено?
            break; // Да - выход из цикла
    if(j == nElems) // Достигнут последний элемент?
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
public boolean delete(long value)
{
    int j;
    for(j=0; j<nElems; j++) // Поиск заданного значения
        if( value == a[j] )
            break;
    if(j==nElems) // Найти не удалось
        return false;
    else // Значение найдено
    {
        for(int k = j; k < nElems - 1; k++) // Сдвиг последующих элементов
            a[k] = a[k + 1];
        nElems--; // Уменьшение размера
        return true;
    }
}
    //-----------------------------------------------------------
    public void display() // Вывод содержимого массива
    {
        for(int j=0; j<nElems; j++) // Для каждого элемента
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

    public void removeMax() {
//        int maxElementIndex = nElems - 1;
//        long[] newArray = new long[nElems - 1];
//        for (int i = 0; i < a.length - 1; i++) {
//            newArray[i] = a[i];
//        }
//        a = newArray;
//        nElems--;
        delete(getMax());
    }
//-----------------------------------------------------------
} // Конец класса HighArray

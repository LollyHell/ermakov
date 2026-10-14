import java.util.logging.Logger;

/**
 * Класс, реализующий структуру данных "Динамический массив" для целых чисел
 * <p>
 * Поддерживает динамическое изменение емкости (capacity) при заполнении,
 * а также операции добавления и удаления элементов с начала, конца и из произвольной позиции
 * </p>
 */
public class DynamicArray {
    /**
     * Внутренний массив для хранения элементов
     */
    public int[] arr;
    /**
     * Фактическое кол-во элементов в массиве
     */
    public int size = 0;

    /**
     * Конструктор по умолчанию класса DynamicArray
     */
    final static int DEFAULT_INITIAL_CAPACITY = 10;
    int initialCapacity;
    final static int[] INITIAL_ARRAY = {};

    public DynamicArray() {
        arr = INITIAL_ARRAY;
    }
    public DynamicArray(int capacity){
        if (capacity < 0){
            capacity = DEFAULT_INITIAL_CAPACITY;
            //Logger.log();
        }
        initialCapacity = capacity;
        arr = new int[initialCapacity];
    }
    public  DynamicArray(int ... arr){
        if (arr.length == 0) {
            this.arr = new int[DEFAULT_INITIAL_CAPACITY];
        }
        else {
            this.arr = new int[arr.length*2];
            for (int i = 0; i < arr.length; i++) {
                this.arr[i] = arr[i];
            }
        }
        size = arr.length;
    }
    public DynamicArray(DynamicArray array){
        arr = new int[array.size];
        size = array.size;
        for (int i = 0; i < size; i++){
            arr[i] = array.arr[i];
        }
    }

    /**
     * Возвращает строковое представление динамического массива
     * <p>
     * Выводит только фактически добавленные элементы (от 0 до {@link #size} - 1)
     * в формате "[elem1, elem2, ...] ".
     * </p>
     *
     * @return строковое представление массива
     */
    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        String res = "[";
        for (int i = 0; i < size - 1; i++) {
            res += arr[i] + ", ";
        }
        res += arr[size - 1];
        return res + "]";
    }

    /**
     * Увеличивает емкость внутренного массива в два раза при его заполнении
     */
    void grow() {
        int len = arr.length;
        if (arr.length == 0){
            len = DEFAULT_INITIAL_CAPACITY;
        }
        else {
            len = arr.length *2;
        }
        int[] newArr = new int[len];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    /**
     * Добавляет элемент в конец динамического массива
     *
     * @param num добавляемое число
     */
    public void addLast(int num) {
        if (size == arr.length) {
            grow();
        }
        arr[size] = num;
        size++;
    }

    /**
     * Удаляет последний элемент из динамического массива
     */
    public void removeLast() {
        System.out.println("Удаление последнего:");
        if (size == 0) {
            return;
        }
        size--;

    }

    /**
     * Добавляет элемент в начало динамического массива
     *
     * @param num добавляемое число
     */

    public void addFirst(int num) {
        System.out.println("Добавление первого:");
        if (size == arr.length) {
            grow();
        }
        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = num;
        size++;

    }

    /**
     * Удаляет первый элемент из динамического массива
     */
    public void removeFirst() {
        System.out.println("Удаление первого:");
        if (size == 0) {
            return;
        }
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }


    /**
     * Добавляет элемент по указанному индексу
     *
     * @param num   добавляемое число
     * @param index индекс, по которому вставляется элемент
     */
    public void addTo(int num, int index) {
        System.out.println("Добавление числа по индексу:");
        if (index < 0 || index > size) {
            return;
        }
        if (size == arr.length) {
            grow();
        }

        for (int i = size; i > index; --i) {
            arr[i] = arr[i - 1];
        }
        arr[index] = num;
        size++;

    }

    /**
     * Удаляет элемент по указанному индексу
     *
     * @param index индекс удаляемого элемента
     */
    public void removeFrom(int index) {
        System.out.println("Удаление числа по индексу:");
        if (size == 0 || index < 0 || index >= size) {
            return;
        }
        if (size == 0) {
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }
}

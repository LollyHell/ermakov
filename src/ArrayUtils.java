/**
 * Класс для обработки массивов, сортировки
 */
public class ArrayUtils {
    /**
     * Конструктор класса ArrayUtils
     */
    public ArrayUtils(){}
    /**
     * Метод, который вычисляет сумму всех переданных целых чисел
     * @param numbers одномерный массив целых чисел
     * @return сумма элементов массива (если передан null, то возвращает 0)
     */
    public static int sum(int... numbers){
        int sum = 0;
        if (numbers == null){
            return 0;
        }
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    /**
     * Метод, который преобразует массив строк в массив целых чисел
     * @param elements массив строк, который содержит числовое значение
     * @return целочисленный массив
     */
    public static int[] converter(String[] elements){
        int []res = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            res[i] = Integer.parseInt(elements[i]);
        }

        return res;
    }

    /**
     * Метод, который создает новый массив и добавляет указанное число в его конец
     * @param nums массив целых чисел
     * @param n число, добавляемое в конец массива
     * @return  новый массив с числом n
     */
    public static int[] addToArr(int[] nums, int n){
        int len = nums.length+1;
        int []res = new int[len];
        for (int i = 0; i < len-1; i++) {
            res[i] = nums[i];
        }
        res[len-1] = n;
        return res;

    }

    /**
     * Метод, который принимает строку и вычисляет сумму ее элементов
     * @param row строка из матрицы
     * @return сумма элементов строки
     */
    public static int getSum(int []row){
        int sum = 0;
        for (int j = 0; j < row.length; j++){
            sum += row[j];
        }
        return sum;
    }

    /**
     * Метод, который принимает двумерный массив чисел и сортирует его по возрастанию
     * суммы строки
     * @param matrix двумерный массив до сортировки
     * @param n количество строк в матрице
     * @param m количество столбцов в матрице
     * @return  отсортированный двумерный массив
     */
    public static int[][] sortMatrix(int [][] matrix, int n, int m){
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-1-i; j++){
                if (getSum(matrix[j]) > getSum(matrix[j+1])){
                    for (int k = 0; k < m; k++){
                        int tmp = matrix[j][k];
                        matrix[j][k] = matrix[j+1][k];
                        matrix[j+1][k] = tmp;
                    }
                }
            }
        }
        return matrix;
    }

}

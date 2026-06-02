import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethodsExample {
    public static void main(String[] args) {
        
        // ===== 1. toString() - преобразование массива в строку =====
        System.out.println("===== toString() =====");
        int[] numbers = {5, 2, 8, 1, 9};
        System.out.println("Массив как строка: " + Arrays.toString(numbers));
        // Вывод: [5, 2, 8, 1, 9]
        
        // Для многомерных массивов используется deepToString()
        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println("2D массив: " + Arrays.deepToString(matrix));
        // Вывод: [[1, 2], [3, 4]]
        
        // ===== 2. sort() - сортировка массива =====
        System.out.println("\n===== sort() =====");
        int[] unsorted = {5, 2, 8, 1, 9};
        System.out.println("До сортировки: " + Arrays.toString(unsorted));
        Arrays.sort(unsorted);
        System.out.println("После сортировки: " + Arrays.toString(unsorted));
        // Вывод: [1, 2, 5, 8, 9]
        
        // Частичная сортировка (от индекса 1 до 4, не включая 4)
        int[] partial = {9, 5, 2, 8, 1, 7};
        Arrays.sort(partial, 1, 4);
        System.out.println("Частичная сортировка (1-3): " + Arrays.toString(partial));
        // Вывод: [9, 2, 5, 8, 1, 7]
        
        // Сортировка объектов с компаратором
        String[] words = {"banana", "apple", "cherry"};
        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println("Сортировка по длине: " + Arrays.toString(words));
        // Вывод: [apple, banana, cherry] (в зависимости от длины)
        
        // ===== 3. binarySearch() - бинарный поиск =====
        System.out.println("\n===== binarySearch() =====");
        int[] sorted = {10, 20, 30, 40, 50};
        int index = Arrays.binarySearch(sorted, 30);
        System.out.println("Индекс элемента 30: " + index);  // 2
        
        // Поиск отсутствующего элемента
        int notFound = Arrays.binarySearch(sorted, 25);
        System.out.println("Поиск 25 (отсутствует): " + notFound);
        // Возвращает -(insertion point) - 1 = -(2) - 1 = -3
        
        // ВАЖНО: binarySearch требует предварительной сортировки!
        int[] unsortedForSearch = {5, 1, 4, 2, 3};
        int badResult = Arrays.binarySearch(unsortedForSearch, 3);
        System.out.println("Поиск в НЕсортированном массиве: " + badResult);  // результат непредсказуем
        
        // ===== 4. equals() - сравнение массивов =====
        System.out.println("\n===== equals() =====");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 4};
        
        System.out.println("arr1 == arr2: " + Arrays.equals(arr1, arr2));  // true
        System.out.println("arr1 == arr3: " + Arrays.equals(arr1, arr3));  // false
        System.out.println("arr1 == arr1: " + Arrays.equals(arr1, arr1));  // true
        
        // Сравнение многомерных массивов - используйте deepEquals()
        int[][] deep1 = {{1, 2}, {3, 4}};
        int[][] deep2 = {{1, 2}, {3, 4}};
        System.out.println("equals для 2D: " + Arrays.equals(deep1, deep2));      // false!
        System.out.println("deepEquals для 2D: " + Arrays.deepEquals(deep1, deep2)); // true
        
        // ===== 5. compare() - лексикографическое сравнение (Java 9+) =====
        System.out.println("\n===== compare() =====");
        int[] comp1 = {1, 2, 3};
        int[] comp2 = {1, 2, 5};
        int[] comp3 = {1, 2};
        
        System.out.println("compare(comp1, comp2): " + Arrays.compare(comp1, comp2));  // -2 (3 < 5)
        System.out.println("compare(comp2, comp1): " + Arrays.compare(comp2, comp1));  // 2 (5 > 3)
        System.out.println("compare(comp1, comp3): " + Arrays.compare(comp1, comp3));  // 1 (первый длиннее)
        
        // ===== ДОПОЛНИТЕЛЬНЫЕ МЕТОДЫ (для справки) =====
        
        // fill() - заполнение массива
        System.out.println("\n===== fill() =====");
        int[] fillArr = new int[5];
        Arrays.fill(fillArr, 42);
        System.out.println("После fill(42): " + Arrays.toString(fillArr));  // [42, 42, 42, 42, 42]
        
        // Частичное заполнение
        int[] partialFill = new int[5];
        Arrays.fill(partialFill, 1, 4, 99);
        System.out.println("Частичное заполнение: " + Arrays.toString(partialFill));  // [0, 99, 99, 99, 0]
        
        // copyOf() - копирование массива
        System.out.println("\n===== copyOf() =====");
        int[] original = {10, 20, 30, 40, 50};
        int[] copy = Arrays.copyOf(original, 3);
        System.out.println("copyOf(original, 3): " + Arrays.toString(copy));  // [10, 20, 30]
        
        int[] extended = Arrays.copyOf(original, 7);
        System.out.println("copyOf(original, 7): " + Arrays.toString(extended));  // [10,20,30,40,50,0,0]
        
        // copyOfRange() - копирование диапазона
        int[] range = Arrays.copyOfRange(original, 1, 4);
        System.out.println("copyOfRange(1,4): " + Arrays.toString(range));  // [20, 30, 40]
        
        // mismatch() - поиск первого несовпадающего элемента
        System.out.println("\n===== mismatch() =====");
        int[] mismatch1 = {1, 2, 3, 4};
        int[] mismatch2 = {1, 2, 5, 4};
        int mismatchIndex = Arrays.mismatch(mismatch1, mismatch2);
        System.out.println("Первый mismatch: " + mismatchIndex);  // 2 (на индексе 2 значения 3 и 5)
    }
}
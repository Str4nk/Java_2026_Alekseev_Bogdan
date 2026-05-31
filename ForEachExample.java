import java.util.*;

public class ForEachExample {
    public static void main(String[] args) {
        
        System.out.println("МАССИВЫ");
        
        // 1. Массив int
        int[] numbers = {1, 3, 5, 7, 9};
        System.out.print("Массив int: ");
        for(int elem : numbers) {
            System.out.print(elem + " ");
        }
        
        System.out.println("\n\nИЗМЕНЕНИЕ ЭЛЕМЕНТОВ НЕВОЗМОЖНО");
        // Попытка изменить значение (не работает)
        int[] arr = {10, 20, 30};
        for(int val : arr) {
            val = 100;  // меняется только локальная копия, массив не меняется
        }
        System.out.print("Массив после попытки изменения: ");
        for(int val : arr) {
            System.out.print(val + " ");  // 10 20 30 - без изменений!
        }
        
        System.out.println("\n\nМАССИВ СТРОК");
        String[] names = {"Анна", "Борис", "Виктор"};
        System.out.print("Строки: ");
        for(String name : names) {
            System.out.print(name + " ");
        }
        
        System.out.println("\n\nКОЛЛЕКЦИИ");
        
        // ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");
        
        System.out.print("Фрукты: ");
        for(String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        
        // HashSet
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        
        System.out.print("\nHashSet: ");
        for(int num : set) {
            System.out.print(num + " ");
        }
        
        System.out.println("\n\nДВУМЕРНЫЙ МАССИВ");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        for(int[] row : matrix) {
            for(int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nbreak и continue в for-each ");
        int[] data = {5, 12, 7, 25, 8, 3, 14};
        
        System.out.print("Числа меньше 10: ");
        for(int val : data) {
            if(val >= 10) {
                continue;  // пропускаем числа >= 10
            }
            System.out.print(val + " ");
        }
        
        System.out.print("\nПоиск числа 25: ");
        for(int val : data) {
            if(val == 25) {
                System.out.println("Нашли 25, останавливаемся");
                break;
            }
            System.out.print(val + " ");
        }
    }
}
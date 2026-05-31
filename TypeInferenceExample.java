import java.util.*;

public class TypeInferenceExample {
    public static void main(String[] args) {
        // Базовые типы
        var number = 42;           // int
        var bigNumber = 10000000000L; // long (т.к. литерал с L)
        var decimal = 3.14;        // double
        var floatNum = 3.14f;      // float
        var flag = true;            // boolean
        var character = 'A';        // char
        
        // Ссылочные типы
        var text = "Hello";         // String
        var list = new ArrayList<String>(); // ArrayList<String>
        var map = new HashMap<Integer, String>(); // HashMap<Integer, String>
        
        // Сложные типы
        var numbers = List.of(1, 2, 3, 4, 5); // List<Integer>
        var optional = Optional.of("Value");   // Optional<String>
        
        // В циклах
        for (var i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        // В try-with-resources
        try (var scanner = new Scanner(System.in)) {
            // использование scanner
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
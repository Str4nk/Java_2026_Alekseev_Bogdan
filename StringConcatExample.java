public class StringConcatExample {
    public static void main(String[] args) {
        String base = "Result: ";
        int intValue = 42;
        double doubleValue = 3.14;
        boolean boolValue = true;
        char charValue = 'X';
        
        // Конкатенация с различными типами
        String result1 = base + intValue;
        String result2 = base + doubleValue;
        String result3 = base + boolValue;
        String result4 = base + charValue;
        
        // Цепочка конкатенаций
        String result5 = "Value: " + intValue + ", " + doubleValue + ", " + boolValue;
        
        System.out.println(result1);  // Result: 42
        System.out.println(result2);  // Result: 3.14
        System.out.println(result3);  // Result: true
        System.out.println(result4);  // Result: X
        System.out.println(result5);  // Value: 42, 3.14, true
        
        // Важный нюанс: порядок операций
        System.out.println(1 + 2 + " = 3");    // "3 = 3" (сначала сложение чисел)
        System.out.println("1 + 2 = " + 1 + 2); // "1 + 2 = 12" (конкатенация строк)
    }
}
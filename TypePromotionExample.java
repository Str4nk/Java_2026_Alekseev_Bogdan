public class TypePromotionExample {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        float f = 5.5f;
        double d = 6.6;
        
        // byte + short -> int
        int result1 = b + s;
        System.out.println("byte + short = int: " + result1);
        
        // int + long -> long
        long result2 = i + l;
        System.out.println("int + long = long: " + result2);
        
        // long + float -> float
        float result3 = l + f;
        System.out.println("long + float = float: " + result3);
        
        // float + double -> double
        double result4 = f + d;
        System.out.println("float + double = double: " + result4);
        
        // Смешанные операции
        double result5 = b + s + i + l + f + d;
        System.out.println("Все типы -> double: " + result5);
        
        // char в арифметических операциях
        char ch = 'A'; // 65
        int result6 = ch + 1;
        System.out.println("char + int = int: " + result6); // 66
    }
}
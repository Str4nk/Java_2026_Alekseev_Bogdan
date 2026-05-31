public class PrimitiveTypesExample {
    // Нулевые значения для членов класса
    byte byteDefault;      // 0
    short shortDefault;    // 0
    int intDefault;        // 0
    long longDefault;      // 0L
    float floatDefault;    // 0.0f
    double doubleDefault;  // 0.0
    char charDefault;      // '\u0000' (null character)
    boolean boolDefault;   // false
    
    public static void main(String[] args) {
        // Примеры значений
        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2147483647;
        long longValue = 9223372036854775807L;
        float floatValue = 3.14f;
        double doubleValue = 3.14159;
        char charValue = 'A';
        boolean boolValue = true;
        
        // Локальные переменные должны быть инициализированы
        int localInt = 0;  // Явная инициализация
        
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + boolValue);
    }
}
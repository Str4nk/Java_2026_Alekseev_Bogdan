public class SwitchTypesExample {
    public static void main(String[] args) {
        
        // 1. byte
        byte b = 2;
        switch(b) {
            case 1: System.out.println("byte = 1"); break;
            case 2: System.out.println("byte = 2"); break;
            default: System.out.println("byte default");
        }
        
        // 2. short
        short s = 10;
        switch(s) {
            case 5: System.out.println("short = 5"); break;
            case 10: System.out.println("short = 10"); break;
            default: System.out.println("short default");
        }
        
        // 3. char
        char c = 'B';
        switch(c) {
            case 'A': System.out.println("char = A"); break;
            case 'B': System.out.println("char = B"); break;
            default: System.out.println("char default");
        }
        
        // 4. int
        int i = 100;
        switch(i) {
            case 50: System.out.println("int = 50"); break;
            case 100: System.out.println("int = 100"); break;
            default: System.out.println("int default");
        }
        
        // 5. enum
        Day day = Day.MONDAY;
        switch(day) {
            case MONDAY: System.out.println("Понедельник"); break;
            case FRIDAY: System.out.println("Пятница"); break;
            default: System.out.println("Другой день");
        }
        
        // 6. String
        String str = "привет";
        switch(str) {
            case "привет": System.out.println("Hello!"); break;
            case "пока": System.out.println("Bye!"); break;
            default: System.out.println("Неизвестно");
        }
        
        // 7. Обертки (Integer, Byte, Short, Character)
        Integer intWrapper = 42;
        switch(intWrapper) {
            case 42: System.out.println("Integer = 42"); break;
            default: System.out.println("Integer default");
        }
    }
    
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
public class DecodeExample {
    public static void main(String[] args) {
        
        // decode() преобразует строку в Integer, распознавая разные системы счисления
        
        // Десятичная система (по умолчанию)
        Integer dec1 = Integer.decode("123");
        Integer dec2 = Integer.decode("+123");
        Integer dec3 = Integer.decode("-123");
        System.out.println("123 = " + dec1);
        System.out.println("+123 = " + dec2);
        System.out.println("-123 = " + dec3);
        
        // Шестнадцатеричная система (0x или #)
        Integer hex1 = Integer.decode("0xFF");    // 255
        Integer hex2 = Integer.decode("0x10");    // 16
        Integer hex3 = Integer.decode("#FF");     // 255
        System.out.println("0xFF = " + hex1);
        System.out.println("0x10 = " + hex2);
        System.out.println("#FF = " + hex3);
        
        // Восьмеричная система (0)
        Integer oct1 = Integer.decode("012");     // 10 (8+2)
        Integer oct2 = Integer.decode("077");     // 63 (7*8+7)
        System.out.println("012 = " + oct1);
        System.out.println("077 = " + oct2);
        
        // Отрицательные в разных системах
        Integer negHex = Integer.decode("-0xFF");  // -255
        Integer negOct = Integer.decode("-077");   // -63
        System.out.println("-0xFF = " + negHex);
        System.out.println("-077 = " + negOct);
    }
}
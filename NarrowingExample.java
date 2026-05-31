public class NarrowingExample {
    public static void main(String[] args) {
        // int -> byte
        int bigInt = 130;
        byte smallByte = (byte) bigInt;
        System.out.println("130 (int) -> byte: " + smallByte); // -126 (переполнение)
        
        // double -> int (потеря дробной части)
        double pi = 3.14159;
        int intPi = (int) pi;
        System.out.println("3.14159 -> int: " + intPi); // 3
        
        // long -> short
        long largeLong = 100000L;
        short shortValue = (short) largeLong;
        System.out.println("100000 -> short: " + shortValue); // -31072
        
        // float -> byte
        float floatValue = 127.8f;
        byte byteValue = (byte) floatValue;
        System.out.println("127.8 -> byte: " + byteValue); // 127
        
        // int -> char
        int codePoint = 65;
        char character = (char) codePoint;
        System.out.println("65 -> char: " + character); // 'A'
    }
}
interface Message {
    class Printer {
        public void print() {
            System.out.println("Сообщение из вложенного класса");
        }
        public static void info() {
            System.out.println("Статический метод");
        }
    }
}

interface MathConstants {
    double PI = 3.14159;
    class Helper {
        public void showConstants() {
            System.out.println("PI = " + PI);
        }
    }
}

interface StringUtils {
    class Converter {
        public static String toUpperCase(String str) {
            return str.toUpperCase();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Message.Printer p = new Message.Printer();
        p.print();
        Message.Printer.info();
        
        MathConstants.Helper h = new MathConstants.Helper();
        h.showConstants();
        
        String s = StringUtils.Converter.toUpperCase("hello");
        System.out.println(s);
    }
}
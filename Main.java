public class Main {
    
    // Статическая переменная (принадлежит классу)
    public static int a = 1;
    public static int b = 2;
    
    // Статический метод
    public static void printVars() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
    public static void main(String[] args) {
        
        System.out.println("=== ВАРИАНТЫ ВЫЗОВА printVars() ===\n");
        
        // Способ 1: Через имя класса (рекомендуемый)
        System.out.println("1. Через имя класса:");
        Main.printVars();
        
        // Способ 2: Через объект класса
        System.out.println("\n2. Через объект класса:");
        Main obj = new Main();
        obj.printVars();
        
        // Способ 3: Прямой вызов (из статического метода того же класса)
        System.out.println("\n3. Прямой вызов:");
        printVars();
        
        // Способ 4: Через null-ссылку (работает!)
        System.out.println("\n4. Через null-ссылку:");
        Main nullObj = null;
        nullObj.printVars();
        
        // Дополнительно: вызов из другого статического метода
        System.out.println("\n5. Вызов из другого метода:");
        callPrintVars();
    }
    
    public static void callPrintVars() {
        printVars();
    }
}
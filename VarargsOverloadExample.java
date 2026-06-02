public class VarargsOverloadExample {
    
    // 1. Метод с String varargs
    public void printStrings(String... strings) {
        System.out.print("printStrings(String...): ");
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    
    // 2. Метод с int varargs
    public void printInts(int... numbers) {
        System.out.print("printInts(int...): ");
        int sum = 0;
        for (int n : numbers) {
            System.out.print(n + " ");
            sum += n;
        }
        System.out.println("| сумма = " + sum);
    }
    
    // 3. Метод с double varargs
    public void printDoubles(double... numbers) {
        System.out.print("printDoubles(double...): ");
        for (double d : numbers) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
    
    // 4. Метод с String prefix и varargs
    public void logWithPrefix(String prefix, String... messages) {
        System.out.print("logWithPrefix(String, String...): " + prefix + " -> ");
        for (String msg : messages) {
            System.out.print(msg + " ");
        }
        System.out.println();
    }
    
    // 5. Метод с int level и varargs
    public void logWithLevel(int level, String... messages) {
        System.out.print("logWithLevel(int, String...): уровень " + level + " -> ");
        for (String msg : messages) {
            System.out.print(msg + " ");
        }
        System.out.println();
    }
    
    // 6. Метод с format и Object varargs
    public void formatWithString(String format, Object... args) {
        System.out.print("formatWithString(String, Object...): ");
        String result = String.format(format, args);
        System.out.println(result);
    }
    
    // 7. Метод с Object varargs (без формата)
    public void formatObjects(Object... args) {
        System.out.print("formatObjects(Object...): ");
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
    
    // 8. Метод с массивом int[]
    public void processArray(int[] array) {
        System.out.print("processArray(int[]): ");
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    
    // 9. Метод с int varargs (отличается от processArray)
    public void processNumbers(int... numbers) {
        System.out.print("processNumbers(int...): ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        VarargsOverloadExample obj = new VarargsOverloadExample();
        
        System.out.println("========== ПЕРЕГРУЗКА VARARGS ==========\n");
        
        // Вызов printStrings(String...)
        obj.printStrings("Hello", "World", "Java");
        obj.printStrings("A", "B");
        obj.printStrings();  // пустой вызов
        
        System.out.println();
        
        // Вызов printInts(int...)
        obj.printInts(1, 2, 3, 4, 5);
        obj.printInts(10, 20);
        obj.printInts();  // пустой вызов
        
        System.out.println();
        
        // Вызов printDoubles(double...)
        obj.printDoubles(1.1, 2.2, 3.3);
        obj.printDoubles(5.5);
        obj.printDoubles();
        
        System.out.println();
        
        // Вызов logWithPrefix(String, String...)
        obj.logWithPrefix("INFO", "Старт", "Процесс", "Завершен");
        obj.logWithPrefix("DEBUG", "Отладка");
        
        // Вызов logWithLevel(int, String...)
        obj.logWithLevel(1, "Ошибка", "Внимание");
        obj.logWithLevel(2, "Предупреждение");
        
        System.out.println();
        
        // Вызов formatWithString(String, Object...)
        obj.formatWithString("Число: %d, строка: %s", 42, "Привет");
        
        // Вызов formatObjects(Object...)
        obj.formatObjects(1, "два", 3.0, true);
        obj.formatObjects("один", 2, 3.14);
        
        System.out.println();
        
        // Вызов processArray(int[])
        obj.processArray(new int[]{1, 2, 3});
        
        // Вызов processNumbers(int...)
        obj.processNumbers(4, 5, 6, 7);
        obj.processNumbers(10, 20, 30);
    }
}
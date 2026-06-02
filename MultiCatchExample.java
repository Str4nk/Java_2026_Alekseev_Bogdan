public class MultiCatchExample {
    
    // 1. Несколько исключений обрабатываются одинаково
    public static void sameHandlingExample() {
        System.out.println("=== Одинаковая обработка нескольких исключений ===");
        
        String[] inputs = {"10", "abc", null};
        
        for (String input : inputs) {
            try {
                int num = Integer.parseInt(input);
                System.out.println("Число: " + num);
            } 
            // Один обработчик для двух разных исключений
            catch (NumberFormatException | NullPointerException e) {
                System.out.println("Ошибка преобразования: " + e.getClass().getSimpleName());
            }
        }
    }
    
    // 2. Иерархия исключений (порядок важен!)
    public static void hierarchyExample() {
        System.out.println("\n=== Иерархия исключений ===");
        
        class Ex1 extends Exception { }
        class Ex2 extends Ex1 { }
        class Ex3 extends Ex2 { }
        
        try {
            // Генерируем Ex3 (самый нижний в иерархии)
            throw new Ex3();
            
        } catch (Ex3 e) {
            System.out.println("Поймано Ex3 (конкретное исключение)");
        } catch (Ex2 e) {
            System.out.println("Поймано Ex2");
        } catch (Ex1 e) {
            System.out.println("Поймано Ex1");
        }
        
        // НЕПРАВИЛЬНЫЙ порядок (ошибка компиляции):
        // catch (Ex1 e) {}  // Будет поймано всё
        // catch (Ex3 e) {}  // Недостижимый код!
    }
    
    // 3. Ошибка: объединение исключений из одной иерархии
    public static void wrongUnionExample() {
        System.out.println("\n=== ОШИБКА: объединение исключений из одной иерархии ===");
        System.out.println("Так писать нельзя, код не скомпилируется:");
        System.out.println("catch (Ex1 | Ex2 e) { } // Ошибка! Ex2 наследник Ex1");
        
        // Правильно: только несвязанные исключения
        System.out.println("\nПравильно: несвязанные исключения");
        try {
            String str = null;
            str.length();
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Поймано: " + e.getClass().getSimpleName());
        }
    }
    
    public static void main(String[] args) {
        sameHandlingExample();
        hierarchyExample();
        wrongUnionExample();
    }
}
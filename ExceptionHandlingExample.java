public class ExceptionHandlingExample {
    
    // Метод, который выбрасывает исключение (не обрабатывает)
    public static void causeException() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[10]); // ArrayIndexOutOfBoundsException - не перехвачено
    }
    
    // Метод, который обрабатывает исключение
    public static void handleException() {
        try {
            int result = 10 / 0; // ArithmeticException
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Исключение перехвачено: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Обработка исключений ===\n");
        
        // 1. Перехваченное исключение
        System.out.println("1. Вызов метода с обработкой исключения:");
        handleException();
        System.out.println("   Программа продолжает работу после перехвата\n");
        
        // 2. Неперехваченное исключение
        System.out.println("2. Вызов метода без обработки исключения:");
        System.out.println("   (Программа аварийно завершится)");
        causeException(); // Здесь произойдет аварийная остановка
        
        // Этот код не выполнится
        System.out.println("Это сообщение не будет выведено");
    }
}